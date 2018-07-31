////Class defining Savings account details
public class MMASaving {
	
	private int accountID;
	private String accoundholder_name;
	private double account_balance;
	private boolean isSalaryAccount;
	
	//Constructor
	public MMASaving(int accountID, String accoundholder_name, double account_balance, boolean isSalaryAccount) {
		this.accountID = accountID;
		this.accoundholder_name = accoundholder_name;
		this.account_balance = account_balance;
		this.isSalaryAccount = isSalaryAccount;
	}

	//Getters
	public int getAccountID() {
		return accountID;
	}

	public String getAccoundholder_name() {
		return accoundholder_name;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	@Override
	public String toString() {
		return "MMASaving [accountID=" + accountID + ", accoundholder_name=" + accoundholder_name + ", account_balance="
				+ account_balance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
	
	

}
