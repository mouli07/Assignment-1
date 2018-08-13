package com.app.controller;

import java.util.Collection;
import java.util.Map;

import com.abc.bankframe.controller.BankController;
import com.abc.bankframe.dao.BankAccountCollection;
import com.abc.bankframe.pojo.BankAccount;
import com.abc.bankframe.pojo.Customer;
import com.app.dao.MMBankDAO;
import com.app.factory.MMBankFactory;

public class MMBankController extends BankController{
	
	private MMBankFactory mmBankFactory;
	private MMBankDAO mmBankCollection;
	private BankAccount bankAccount;

	//This method gets called from the context file called MMBank.xml
	public void setMmBankFactory(MMBankFactory mmBankFactory) {
		this.mmBankFactory = mmBankFactory;
	}


	//This method gets called from the context file called MMBank.xml
	public void setMmBankCollection(MMBankDAO mmBankCollection) {
		this.mmBankCollection = mmBankCollection;
	}

	
	//This method creates the new Current Account.
	@Override
	public void createNewCurrentAccount(Map<String, Object> map) {
		bankAccount = mmBankFactory.createNewCurrentAccount(map);
		mmBankCollection.addBankAccount(bankAccount);
	}
	

	//This method creates the new Current Account.
	@Override
	public void createNewSavingsAccount(Map<String, Object> map) {
		bankAccount = mmBankFactory.createNewSavingsAccount(map);
		mmBankCollection.addBankAccount(bankAccount);
	}

	
	//This method serves the request for getting the list of all the accounts.
	@Override
	public Collection<BankAccount> getAllAccounts() {
		return BankAccountCollection.viewAll();
	}

	
	//this method serves the request for getting the list of all the customers. 
	@Override
	public Collection<Customer> getAllCustomers() {
		return mmBankCollection.getCustomers();
	}

	//This method serves the request of searching an account by account number.
	public BankAccount getAccountByAccountNumber(int accountToBeSearched) {
		return mmBankCollection.getAccountByAccountNumber(accountToBeSearched);
	}

	//This method serves the request for withdrawal of  amount from the given account number.
	public void withdrawAmountFromAccount(int accountToDeductedFrom, double amount) {
		mmBankCollection.withdrawAmount(accountToDeductedFrom,amount);
	}

	//This method serves the request for deposit of  amount into the given account number.	
	public void depositAmountIntoAccount(int accountToBeDepositedIn, double amount) {
		mmBankCollection.depositAmount(accountToBeDepositedIn,amount);
	}


	public void performFundTransfer(int receipientAccountNumber, int donerAccountNumber, double amountToBeTransffered) {
		mmBankCollection.performFundTransfer(receipientAccountNumber,donerAccountNumber,amountToBeTransffered);
	}

}
