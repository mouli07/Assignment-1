package com.framework.dao;
import java.util.Set;

import com.framework.pojo.BankAccount;
import com.framework.pojo.Customer;

public interface BankDAO {
	
	
		/**
		 * @return Set of Accounts
		 * 
		 * This method is responsible for returning all the active accounts
		 */
		Set<BankAccount> viewAll();
		
		Set<Customer> viewAllCutomers();
		
		BankAccount searchAccount(int accNum);

}
