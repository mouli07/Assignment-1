package com.bank.pojo;

public class Customer {
	
	private int custID;
	private String custName;
	private String custDob;
	private String gender;
	private String custEmail;
	private long custContact;
	private String custAddress;
	
	public Customer(int custID, String custName, String custDob, String gender, String custEmail, long custContact,
			String custAddress) {
		this.custID = custID;
		this.custName = custName;
		this.custDob = custDob;
		this.gender = gender;
		this.custEmail = custEmail;
		this.custContact = custContact;
		this.custAddress = custAddress;
	}

	public int getCustID() {
		return custID;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustDob() {
		return custDob;
	}

	public String getGender() {
		return gender;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public long getCustContact() {
		return custContact;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustDob(String custDob) {
		this.custDob = custDob;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public void setCustContact(long custContact) {
		this.custContact = custContact;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custDob=" + custDob + ", gender=" + gender
				+ ", custEmail=" + custEmail + ", custContact=" + custContact + ", custAddress=" + custAddress + "]";
	}
	
	
}
