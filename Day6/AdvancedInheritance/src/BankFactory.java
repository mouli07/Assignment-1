
public abstract class BankFactory {

	 public abstract SavingAcc getNewSavingAccount(String accNm,int accNo,float accBal, boolean isSalaried);
	
	 public abstract CurrentAcc getNewCurrentAccount(String accNm,int accNo,float accBal, float creditLimit);
}
