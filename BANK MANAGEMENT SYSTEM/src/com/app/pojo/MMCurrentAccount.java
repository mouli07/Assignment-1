package com.app.pojo;

import com.abc.bankframe.pojo.BankAccount;
import com.abc.bankframe.pojo.CurrentAccount;
import com.abc.bankframe.pojo.Customer;


public class MMCurrentAccount extends CurrentAccount implements Comparable<BankAccount>{

	
	
	String accountType;
	
	public MMCurrentAccount(Customer accountHolder, double accountBalance, double odLimit, String accountType) {
		super(accountHolder, accountBalance, odLimit);
		this.accountType=accountType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(BankAccount currentAccount) {
		return this.getAccountNumber()-currentAccount.getAccountNumber();
	}
	
	public double withdraw(double amountToBeWithDrawn) {
		if(this.getAccountBalance()+this.getOdLimit()>=amountToBeWithDrawn) {
			this.setAccountBalance(this.getAccountBalance()-amountToBeWithDrawn);
			return amountToBeWithDrawn;
		}else {
			return -1;
		}
	}
}