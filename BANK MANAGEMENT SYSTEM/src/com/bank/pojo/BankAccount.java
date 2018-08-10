package com.bank.pojo;


public abstract class BankAccount {
	
	private final int accountNumber;
	private Customer accountHolder;
	private double accountBalance;
	private static int accountId;
	
	
	static {
		accountId=100;
	}
	
	{
	this.accountNumber = ++accountId;
	}
	
	public BankAccount(Customer accountHolder, double accountBalance) {
		
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	//For zero balance account
	public BankAccount(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	

}
