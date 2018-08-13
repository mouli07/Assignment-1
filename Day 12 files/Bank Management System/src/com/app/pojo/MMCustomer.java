package com.app.pojo;

import java.time.LocalDate;

import com.abc.bankframe.pojo.Customer;

public class MMCustomer extends Customer{

	public MMCustomer(String customerName, long contactNumber, LocalDate dateOfBirth, String addrs, MMCustomerAddress mmBankCustomerAddress, String nationality,
			String gender) {
		super(customerName, contactNumber, dateOfBirth, addrs, nationality, gender);
		// TODO Auto-generated constructor stub
	}
	
	

}
