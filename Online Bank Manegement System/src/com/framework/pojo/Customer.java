package com.framework.pojo;

/**
 *Maintaining customer details of money money bank
 */
public class Customer {
	private int customerId;
	private String customerName;
	private String contactNumber;
	private String emailId;
	private String dateOfBirth;
	private String address;
	private String nationality;
	private String gender;

	
	public Customer(int customerId,String customerName, String contactNumber,String dateOfBirth, String address,
			String nationality, String gender,String email) 
	
	{
		this.customerId=customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.address=address;
		this.nationality = nationality;
		this.gender = gender;
		this.emailId=email;
	}
	
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}
	public void setPermanentAddress(String address) {
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", nationality=" + nationality + ", gender=" + gender + "]";
	}
	

}

