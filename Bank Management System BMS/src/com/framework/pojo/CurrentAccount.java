package com.framework.pojo;

/**
*
*Maintaining current account details of all the holders
*/
public abstract class CurrentAccount extends BankAccount {
	private double odLimit;

	public CurrentAccount(int accountNumber,Customer accountHolder, double accountBalance, double odLimit) {
		super(accountNumber,accountHolder, accountBalance);
		this.odLimit = odLimit;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	
	
	@Override
	public String toString() {
		return "CurrentAccount [odLimit=" + odLimit + "]";
	}

	public void withdraw(double amount)
	{
		setAccountBalance((amount<=getAccountBalance()+odLimit)?(getAccountBalance()-amount):getAccountBalance());
	}
}

