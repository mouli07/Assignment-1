package com.framework.dao;

import java.util.HashSet;
import java.util.Set;

import com.framework.pojo.BankAccount;


public abstract class BankDAOImpl implements BankDAO {
	
	private static Set<BankAccount> bankAccountSet;
	
	static {
		bankAccountSet = new HashSet<>();
	}
	
	
	@Override
	public void addBankAccount(BankAccount bankAccount) {
		bankAccountSet.add(bankAccount);
	}
	
	
	public Set<BankAccount> viewAll(){
		return bankAccountSet;
	}
}

