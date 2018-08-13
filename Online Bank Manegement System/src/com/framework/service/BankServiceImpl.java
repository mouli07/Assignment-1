package com.framework.service;

import java.util.Set;

import com.framework.dao.BankDAOImpl;
import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;

public class BankServiceImpl implements BankService{
	
	BankDAOImpl dao=new BankDAOImpl();

	@Override
	public Collection<BankAccount> viewAll() {
		// TODO Auto-generated method stub
		return dao.viewAll();
	}

	@Override
	public Collection<Customer> viewAllCutomers() {
		// TODO Auto-generated method stub
		return dao.viewAllCutomers();
	}

	@Override
	public BankAccount searchAccount(int accNum) {
		// TODO Auto-generated method stub
		return dao.searchAccount(accNum);
	}

	@Override
	public int withdraw(int accNo, double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(accNo,amount);
	}

	@Override
	public int deposit(int accNo, double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(accNo, amount);
	}

	@Override
	public int fundTransfer(int accNoSender, int accNoReciever, double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(accNoSender, accNoReciever, amount);
	}

	@Override
	public BankAccount getAccountById(int id) {
		// TODO Auto-generated method stub
		return dao.getAccountById(id);
	}
	
	
	

}
