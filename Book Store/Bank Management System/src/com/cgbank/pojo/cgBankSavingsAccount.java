package com.cgbank.pojo;

import com.framework.pojo.Customer;
import com.framework.pojo.SavingsAccount;

public class cgBankSavingsAccount extends SavingsAccount{

	public cgBankSavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder, salary);
		// TODO Auto-generated constructor stub
	}

	public cgBankSavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance, salary);
		// TODO Auto-generated constructor stub
	}
	
	

}
