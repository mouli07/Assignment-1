package com.app.controller;

import java.util.Collection;

import com.app.service.MMBankService;
import com.framework.controller.BankController;
import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;
import com.framework.service.BankService;

public class MMBankController extends BankController{

		BankService service;

		public MMBankController() {
			service=new MMBankService();
		}

		@Override
		public Collection<BankAccount> getAllAccounts() {
			// TODO Auto-generated method stub
			return service.viewAll();
		}

		@Override
		public Collection<Customer> getAllCustomers() {
			// TODO Auto-generated method stub
			return service.viewAllCutomers();
		}

		@Override
		public BankAccount searchAccount(int accNum) {
			// TODO Auto-generated method stub
			return service.searchAccount(accNum);
		}

		@Override
		public int withdraw(int accNo, double amount) {
			// TODO Auto-generated method stub
			return service.withdraw(accNo, amount);
		}

		@Override
		public int deposit(int accNo, double amount) {
			// TODO Auto-generated method stub
			return service.deposit(accNo, amount);
		}

		@Override
		public int fundTransfer(int accNoSender, int accNoReciever, double amount) {
			// TODO Auto-generated method stub
			return service.fundTransfer(accNoSender, accNoReciever, amount);
		}

		@Override
		public BankAccount getAccountById(int id) {
			// TODO Auto-generated method stub
			return service.getAccountById(id);
		}

		/*@Override
		public void createNewCurrentAccount(Map<String, Object> arg0) {
			service.createNewSavingsAccount(arg0);
		}

		@Override
		public void createNewSavingsAccount(Map<String, Object> arg0) {
			service.createNewSavingsAccount(arg0);
		}*/

		

}
