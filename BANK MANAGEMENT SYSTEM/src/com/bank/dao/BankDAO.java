package com.bank.dao;

import com.bank.pojo.BankAccount;
import com.bank.pojo.Customer;

public interface BankDAO {

	public void addNewAccount(Customer customer,BankAccount bankAccount);
	
	public void searchAccount(int accountNumber);
	
	public void viewaccount(int accountNumber);
	
	public void viewallcustomer(int customerid);
	
	public void updatecustomerform(int customerid);
	
	public void withdraw(Customer customer,BankAccount bankAccount);
	
	public void deposit(Customer customer,BankAccount bankAccount);
	
	public void fundtransfer(Customer customer,BankAccount bankAccount);
	
	
	
	
	
	
}
