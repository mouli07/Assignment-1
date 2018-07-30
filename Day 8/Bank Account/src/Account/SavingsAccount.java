//Class defining Savings Account Features
package Account;


public class SavingsAccount implements Comparable<SavingsAccount>{
	
	private double acc_balance;
	private int acc_ID;
	private String accountHoldername;
	private Boolean isSalaryAccount;
	
	
	public SavingsAccount(double acc_balance, int acc_ID, String accountHoldername, Boolean isSalaryAccount) {
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	
	public double getAcc_balance() {
		return acc_balance;
	}
	public double getAcc_ID() {
		return acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public Boolean getIsSalaryAccount() {
		return isSalaryAccount;
	}
	
	
	protected boolean withdraw(double amount)
	{
		//if requested amount is greater than balance in account then service is denied
		if(amount>acc_balance)
			return false;
		
		//else the deduction is done from balance and success message is passed
		acc_balance-=amount;
		return true;
	}
	
	//depositing the amount by incrementing the account balance
	protected void deposit(double amount)
	{
		acc_balance+=amount;
	}


	@Override
	public int compareTo(SavingsAccount sa) {
		// TODO Auto-generated method stub
		return (this.acc_ID-sa.acc_ID);
	}
	
	
	

}
