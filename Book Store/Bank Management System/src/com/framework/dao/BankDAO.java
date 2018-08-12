package com.framework.dao;
import java.util.Set;

import com.framework.pojo.BankAccount;

public interface BankDAO {
	
	/**
		 * @param bankAccount
		 * 
		 * This method takes account object and adds it in the database
		 */
		void addBankAccount(BankAccount bankAccount);

		/**
		 * @return Set of Accounts
		 * 
		 * This method is responsible for returning all the active accounts
		 */
		Set<BankAccount> viewAll();

}
