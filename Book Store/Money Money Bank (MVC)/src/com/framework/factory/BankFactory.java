package com.framework.factory;

import java.util.Map;

import com.framework.pojo.CurrentAccount;
import com.framework.pojo.SavingsAccount;

/**
 * 
 * 
 * 
 * For creating the account objects
 *
 */
public abstract class BankFactory {
	
	public abstract SavingsAccount createNewSavingsAccount(Map<String, Object> account);
	
	public abstract CurrentAccount createNewCurrentAccount(Map<String, Object> account);
	
	
}

