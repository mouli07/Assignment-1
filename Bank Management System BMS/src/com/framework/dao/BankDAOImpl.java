package com.framework.dao;

import java.util.HashSet;
import java.util.Set;

import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;


public class BankDAOImpl implements BankDAO {
	
	
	private static Set<BankAccount> bankAccountSet= new HashSet<>();
	public static Set<Customer> customerSet = new HashSet<>();
	
	
	private static Customer cust1=new Customer("Tom","9807654356","tomwhite@capgemini.com","02/04/1995","Sector 2, Airoli","Indian","Male");
	private static Customer cust2=new Customer("Sam","9569984790","samgreen@capgemini.com","04/04/1996","Sector 2, Ghansoli","Indian","Male");
	private static Customer cust3=new Customer("Lily","9807654356","lily.baker@capgemini.com","02/04/1993","Sector 2, Airoli","Indian","Female");
	
	static {
		customerSet.add(cust1);
		customerSet.add(cust2);
		customerSet.add(cust3);
		
	}
	private static BankAccount acc1=new BankAccount(101,cust1,23456);
	private static BankAccount acc2=new BankAccount(102,cust2,788456);
	private static BankAccount acc3=new BankAccount(103,cust3,236768456);
	
	static {
		bankAccountSet.add(acc1);
		bankAccountSet.add(acc2);
		bankAccountSet.add(acc3);
		
	}
	@Override
	public Set<BankAccount> viewAll(){
		return bankAccountSet;
	}
	public BankAccount searchAccount(int accNum)
	{
		for(BankAccount bank : viewAll())
		{
			if(BankAccount.getAccountNumber()==accNum)
			{
				return bank;
			}
		}
		return null;
	}
	
	public Set<Customer> viewAllCutomers(){
		return customerSet;
	}
	
	public int withdraw(int accNo,double amount) {
		
		BankAccount account = getAccountById(accNo);
		double amountBefore = account.getAccountBalance();
		account.deposit(amount);
		
		return (int) account.getAccountBalance();

		/*if (amountBefore == account.getAccountBalance())
			return -1;
		else
			return 1;*/
		
	}
	public BankAccount getAccountById(int id) {
		for (BankAccount account : viewAll()) {
			if (BankAccount.getAccountNumber() == id)
				return account;
		}
		return null;

	}
	
	public int deposit(int accNo,double amount) {
		
		BankAccount account = getAccountById(accNo);
		double amountBefore = account.getAccountBalance();
		account.deposit(amount);
		
		return (int) account.getAccountBalance();

		/*if (amountBefore == account.getAccountBalance())
			return -1;
		else
			return 1;*/
		
	}
	
	public int fundTransfer(int accNoSender,int accNoReciever,double amount) {
		
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
	
	/*@Override
	public void addBankAccount(BankAccount bankAccount) {
		bankAccountSet.add(bankAccount);
	}*/
	
	
}

