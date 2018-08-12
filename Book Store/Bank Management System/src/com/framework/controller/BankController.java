package com.framework.controller;

import java.util.Collection;
import java.util.Map;

import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;
import com.framework.service.BankService;

/**
 * 
 * 
 * This is a controller which has all abstraction of bank services
 */
public abstract class BankController {
	
	BankService service;

	public abstract void createNewSavingsAccount(Map<String, Object> account);

	public abstract void createNewCurrentAccount(Map<String, Object> account);
	
	public double getCurrrentBalance(BankAccount bankAccount) {
		return bankAccount.getAccountBalance();
	}
	
	public int getNextAccountNumber() {
		return BankAccount.getNextAccountNumber();
	}
	
	public abstract Collection<BankAccount> getAllAccounts();
	
	public abstract Collection<Customer> getAllCustomers();
	
	public abstract BankAccount getAccountById(int id);
	
}
