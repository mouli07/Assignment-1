package com.framework.pojo;

/**
 *
 *Maintaining savings account details of money money bank
 */
public abstract class SavingsAccount extends BankAccount {
	private boolean salary;

	public SavingsAccount(int accountNumber,Customer accountHolder, double accountBalance, boolean salary) {
		super(accountNumber, accountHolder, accountBalance);
		this.salary = salary;
	}
	public SavingsAccount(int accountNumber,Customer accountHolder, boolean salary) {
		super(accountNumber,accountHolder);
		this.salary = salary;
	}

	public boolean isSalary() {
		return salary;
	}
	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SavingsAccount [salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	public void withdraw(double amount)
	{
		setAccountBalance((amount<=getAccountBalance())?(getAccountBalance()-amount):getAccountBalance());
	}
}

