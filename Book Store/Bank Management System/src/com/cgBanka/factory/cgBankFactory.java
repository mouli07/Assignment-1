package com.cgBanka.factory;
import java.time.LocalDate;
import java.util.Map;

import com.cgbank.pojo.cgBankCurrentAccount;
import com.cgbank.pojo.cgBankCustomer;
import com.cgbank.pojo.cgBankSavingsAccount;
import com.framework.factory.*;
import com.framework.pojo.CurrentAccount;
import com.framework.pojo.SavingsAccount;

public class cgBankFactory extends BankFactory {

	@Override
	public CurrentAccount createNewCurrentAccount(Map<String, Object> arg0) {
		System.out.println("L2.1");
		return new cgBankCurrentAccount(
				(new cgBankCustomer((String) arg0.get("accountHolderName"), (long) arg0.get("contactNo"),
						(LocalDate) arg0.get("dateOfBirth"), (String) arg0.get("address"), (String) arg0.get("nationality"),
						(String) arg0.get("gender"),(String)arg0.get("email"))),
				(double) arg0.get("accountBalance"), (double) arg0.get("overdraft"));
	}

	@Override
	public SavingsAccount createNewSavingsAccount(Map<String, Object> arg0) {
	System.out.println("L2.2");
	System.out.println(arg0.get("salary"));
		return new cgBankSavingsAccount((new cgBankCustomer((String) arg0.get("accountHolderName"), (long) arg0.get("contactNo"),
						(LocalDate) arg0.get("dateOfBirth"), (String) arg0.get("address"), (String) arg0.get("nationality"),
						(String) arg0.get("gender"),(String)arg0.get("email"))),
				(double) arg0.get("accountBalance"), (boolean)arg0.get("salary"));
	}
	

}
