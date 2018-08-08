package com.moneymoney.app.console.controller;

import java.util.Collection;
import java.util.Map;

import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.controller.BankController;

public class MMBankAccountController extends BankController {

	BankAccountCollection collection;
	MMBankFactory MMFact = new MMBankFactory();
	
	public void setCollection(BankAccountCollection collection)
	{
		this.collection=collection;
	}
	
	@Override
	public void createNewCurrentAccount(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
		collection.addBankAccount(MMFact.createNewCurrentAccount(agr0));
		
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
		collection.addBankAccount(MMFact.createNewSavingsAccount(arg0));
	}

	@Override
	public Collection<BankAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return collection.viewAll;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> listOfCustomer = new ArrayList<>();
		(collection.viewAll()).stream().forEach((element)->listOfCustomer.add(element.getAccountHolder()));
		return listOfCustomer;
	}
	
	public BankAccount getAccountById(int id)
	{
		for(BankAccount account:collection.viewAll())
		{
		if(account.gerAccountNumber()==id)
			return account;
		}
		return null;
	}

	public void withdraw(int accNo,double amount)
	{
	BankAccount account=getAccountById(accNo);
	}
}
