package com.cgBanka.controller;
import java.util.Collection;
import java.util.Map;

import com.cgBanka.service.cgBankService;
import com.framework.controller.BankController;
import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;
import com.framework.service.BankService;

public class cgBankController extends BankController{
	
		BankService service;

		public cgBankController() {
			service=new cgBankService();
		}

		@Override
		public void createNewCurrentAccount(Map<String, Object> arg0) {
			service.createNewSavingsAccount(arg0);
		}

		@Override
		public void createNewSavingsAccount(Map<String, Object> arg0) {
			service.createNewSavingsAccount(arg0);
		}

		@Override
		public Collection<BankAccount> getAllAccounts() {
			
			return service.getAllAccounts();
		}

		@Override
		public Collection<Customer> getAllCustomers() {
			return service.getAllCustomers();
		}

		@Override
		public BankAccount getAccountById(int id) {

			return service.getAccountById(id);

		}

		public void withdraw(int accNo, double amount) {
			BankAccount account = getAccountById(accNo);
			account.setAccountBalance((amount <= (account.getAccountBalance()) ? (account.getAccountBalance() - amount)
					: account.getAccountBalance()));
		}
		
		
	

}
