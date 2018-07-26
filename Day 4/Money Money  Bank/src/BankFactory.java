

public abstract class BankFactory {

	 public abstract SavingsAccount getNewSavingAccount(String accNm,int accNo,float accBal, boolean isSalaried);
	
	 public abstract CurrentAccount getNewCurrentAccount(String accNm,int accNo,float accBal, float creditLimit);


}
