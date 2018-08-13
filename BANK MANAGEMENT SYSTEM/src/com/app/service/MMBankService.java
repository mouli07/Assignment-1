package com.app.service;

import java.util.Collection;

import com.abc.bankframe.pojo.BankAccount;
import com.abc.bankframe.pojo.Customer;
import com.app.dao.MMBankDAO;

public class MMBankService {
	
	MMBankDAO bankCollection = new MMBankDAO();
	
	public BankAccount addBankAccount(BankAccount bankAccount) {
		//System.out.println("bankAccount return : " +(bankCollection.addBankAccount(bankAccount)));
		return bankAccount;
	}
	
	
	public BankAccount getAccountByAccountNumber(int accountToBeSearched) {
	  
	  return bankCollection.getAccountByAccountNumber(accountToBeSearched);
	}
	
	public Collection<Customer> getCustomers() {
		return bankCollection.getCustomers();
	}
	
	public Collection<BankAccount> getBankAccounts() {
		return bankCollection.getBankAccounts();
	}
	
	
	public Double withdrawAmount(int accountToDeductedFrom, double amount) {
	 return	bankCollection.withdrawAmount(accountToDeductedFrom, amount);
	
	}
	
	public Double depositAmount(int accountToBeDepositedIn, double amount) {
		return bankCollection.depositAmount(accountToBeDepositedIn, amount);
		
	}

   public Double performFundTransfer(int receipientAccountNumber, int donerAccountNumber, double amountToBeTransffered) {
		
		return bankCollection.performFundTransfer(receipientAccountNumber, donerAccountNumber, amountToBeTransffered);
	}
   

}
