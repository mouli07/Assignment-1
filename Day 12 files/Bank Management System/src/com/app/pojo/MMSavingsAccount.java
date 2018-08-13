package com.app.pojo;

import com.abc.bankframe.pojo.BankAccount;
import com.abc.bankframe.pojo.Customer;
import com.abc.bankframe.pojo.SavingsAccount;

public class MMSavingsAccount extends SavingsAccount implements Comparable<BankAccount> {

	String accountType;
	public MMSavingsAccount(Customer accountHolder, double accountBalance, boolean salary, String accountType) {
		super(accountHolder, accountBalance, salary);
		this.accountType=accountType;
		// TODO Auto-generated constructor stub
	}

	public MMSavingsAccount(Customer accountHolder, boolean salary, String accountType) {
		super(accountHolder, salary);
		this.accountType=accountType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(BankAccount BankAccount) {
		return this.getAccountNumber() - BankAccount.getAccountNumber();
	}

	public double withdraw(double amountToBeWithDrawn) {
		if (this.getAccountBalance()>= amountToBeWithDrawn) {
			this.setAccountBalance(this.getAccountBalance() - amountToBeWithDrawn);
			return amountToBeWithDrawn;
		}else {
			return -1;
		}
	}

}