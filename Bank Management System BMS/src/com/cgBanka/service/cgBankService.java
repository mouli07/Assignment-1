package com.cgBanka.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cgBanka.factory.cgBankFactory;
import com.cgbank.dao.cgBankDAO;
import com.framework.dao.BankDAOImpl;
import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;
import com.framework.service.BankService;


public class cgBankService extends BankService{
	
	BankDAOImpl collection=new BankDAOImpl();

	public cgBankService() {
		super();
	}

	@Override

	/*public void createNewSavingsAccount(Map<String, Object> account) {

		collection.addBankAccount(new cgBankFactory().createNewSavingsAccount(account));
	}

	@Override
	public void createNewCurrentAccount(Map<String, Object> account) {
		collection.addBankAccount(new cgBankFactory().createNewCurrentAccount(account));
	}
*/
	public Collection<BankAccount> getAllAccounts() {
		return collection.viewAll();
		// return null;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> listOfCustomer = new ArrayList<>();
		(collection.viewAll()).stream().forEach((element) -> listOfCustomer.add(element.getAccountHolder()));
		return listOfCustomer;
	}

	@Override
	public BankAccount getAccountById(int id) {
		for (BankAccount account : collection.viewAll()) {
			if (BankAccount.getAccountNumber() == id)
				return account;
		}
		return null;

	}

	public int withdraw(int accNo, double amount) {
		BankAccount account = getAccountById(accNo);
		double amountBefore = account.getAccountBalance();
		account.withdraw(amount);

		return (int) account.getAccountBalance();
		/*if (amountBefore == account.getAccountBalance())
			return -1;
		else
			return 1;*/
	}

	@Override
	public int fundTransfer(int accNoSender, int accNoReciever, double amount) {
		
		BankAccount account = getAccountById(accNoSender);
		double amountBefore = account.getAccountBalance();
		account.withdraw(amount);
		/*if (amountBefore == account.getAccountBalance())
			return -1;
		else
		{*/
			account = getAccountById(accNoReciever);
			account.deposit(amount);
			return (int) account.getAccountBalance();
	//	}
		
	}

	@Override
	public int deposit(int accNo, double amount) {
		
		BankAccount account = getAccountById(accNo);
		double amountBefore = account.getAccountBalance();
		account.deposit(amount);
		
		return (int) account.getAccountBalance();

		/*if (amountBefore == account.getAccountBalance())
			return -1;
		else
			return 1;*/
		
	}

	@Override
	public BankAccount searchAccount(int accNum) {
		// TODO Auto-generated method stub
		
		return collection.searchAccount(accNum);
	}

}
