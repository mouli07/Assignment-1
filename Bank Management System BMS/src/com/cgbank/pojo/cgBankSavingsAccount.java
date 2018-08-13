package com.cgbank.pojo;

import com.framework.pojo.Customer;
import com.framework.pojo.SavingsAccount;

public class cgBankSavingsAccount extends SavingsAccount{

	public cgBankSavingsAccount(int accountNumber,Customer accountHolder, boolean salary){
		super(accountNumber,accountHolder, salary);
		// TODO Auto-generated constructor stub
	}

	public cgBankSavingsAccount(int accountNumber,Customer accountHolder, double accountBalance, boolean salary) {
		super(accountNumber,accountHolder, accountBalance, salary);
		// TODO Auto-generated constructor stub
	}
	
	

}
