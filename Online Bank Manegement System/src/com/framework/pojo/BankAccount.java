package com.framework.pojo;

public class BankAccount {
	
	private static int accountNumber;
	private Customer accountHolder;
	private double accountBalance;
	
	public BankAccount(int accountNumber, Customer accountHolder, double accountBalance) {
	
		BankAccount.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	//For Zero balance account
	public BankAccount(int accountNumber, Customer accountHolder) {
		
		BankAccount.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public static int getAccountNumber() {
		return accountNumber;
	}

	public Customer getAccountHolder() {
		return accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountNumber(int accountNumber) {
		BankAccount.accountNumber = accountNumber;
	}

	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	
		//withdraw function with default functionality
		public void deposit(double amount)
		{
			accountBalance+=amount;
		}
		
		//deposit function with default functionality
		public void withdraw(double amount)
		{
			accountBalance-=amount;
		}
	
	
	
}