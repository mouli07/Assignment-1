package com.app.factory;

import java.time.LocalDate;
import java.util.Map;

import com.abc.bankframe.factory.BankFactory;
import com.abc.bankframe.pojo.CurrentAccount;
import com.abc.bankframe.pojo.SavingsAccount;
import com.app.pojo.MMCurrentAccount;
import com.app.pojo.MMCustomer;
import com.app.pojo.MMCustomerAddress;
import com.app.pojo.MMSavingsAccount;

public class MMBankFactory extends BankFactory {
	
	MMCurrentAccount mmBankCurrentAccount;
	MMSavingsAccount mmBankSavingAccount;
	MMCustomer mmBankCustomer;
	MMCustomerAddress mmBankCustomerAddress;

	@Override
	public CurrentAccount createNewCurrentAccount(Map<String, Object> map) {
		mmBankCustomerAddress = new MMCustomerAddress(map.get("houseNo").toString(), map.get("street").toString(),
				map.get("city").toString(), map.get("state").toString(), Integer.parseInt(map.get("pincode").toString()));
		
		mmBankCustomer = new MMCustomer(map.get("accountHolderName").toString(),Long.parseLong((map.get("contactNumber").toString())),
				(LocalDate) map.get("dateOfBirth"),map.get("email").toString(),  mmBankCustomerAddress, map.get("nationality").toString(),
				map.get("gender").toString());
		 
		 mmBankCurrentAccount = new MMCurrentAccount(mmBankCustomer, Double.parseDouble((map.get("accountBalance").toString())),
				 Double.parseDouble((map.get("odLimit").toString())), map.get("accountType").toString());
		 
		 System.out.println(mmBankCustomerAddress);
		 System.out.println(mmBankCustomer);
		return mmBankCurrentAccount;
	}

	@Override
	public SavingsAccount createNewSavingsAccount(Map<String, Object> map) {
		
			    mmBankCustomerAddress = new MMCustomerAddress(map.get("houseNo").toString(),
					map.get("street").toString(), map.get("city").toString(), map.get("state").toString(),
					Integer.parseInt(map.get("pincode").toString()));
				 
			    mmBankCustomer = new MMCustomer(map.get("accountHolderName").toString(),Long.parseLong((map.get("contactNumber").toString())),
						(LocalDate) map.get("dateOfBirth"),map.get("email").toString(),  mmBankCustomerAddress, map.get("nationality").toString(),
						map.get("gender").toString());
			
			    mmBankSavingAccount = new MMSavingsAccount(mmBankCustomer, Double.parseDouble((map.get("accountBalance").toString())),
					(boolean) map.get("salaried"), map.get("accountType").toString());
			    
			    System.out.println(mmBankCustomerAddress);
				System.out.println(mmBankCustomer);
			    System.out.println(mmBankSavingAccount); 
			return mmBankSavingAccount;
	}

}
