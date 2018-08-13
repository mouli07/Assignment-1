package com.framework.dao;
import java.util.Set;

import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;

public interface BankDAO {
	
	Collection<BankAccount> viewAll();
	
	Collection<Customer> viewAllCutomers();
	
	BankAccount searchAccount(int accNum);
	
	public int withdraw(int accNo,double amount);
	
	public int deposit(int accNo,double amount);
	
	public int fundTransfer(int accNoSender,int accNoReciever,double amount);
	
	public BankAccount getAccountById(int id);

}
