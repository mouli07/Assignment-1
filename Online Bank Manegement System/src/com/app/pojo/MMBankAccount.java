package com.app.pojo;

import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;

public class MMBankAccount extends BankAccount{

	public MMBankAccount(int accountNumber, Customer accountHolder, double accountBalance) {
		super(accountNumber, accountHolder, accountBalance);
		// TODO Auto-generated constructor stub
	}

	public MMBankAccount(int accountNumber, Customer accountHolder) {
		super(accountNumber, accountHolder);
		// TODO Auto-generated constructor stub
	}
	
	

}
