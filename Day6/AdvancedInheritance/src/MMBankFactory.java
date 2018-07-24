
public class MMBankFactory extends BankFactory{


	 public SavingAcc getNewSavingAccount(String accNm,int accNo,float accBal, boolean isSalaried)
	 {
		  MMSavingAcc mmSavingAcc = new MMSavingAcc(accNm, accNo, accBal, isSalaried);  // Constructor for Initializing Saving Account from MM Bank faactory to get new savings account
				  return mmSavingAcc;
	 }
	
	 public CurrentAcc getNewCurrentAccount(String accNm,int accNo,float accBal, float creditLimit)
	 {
		 MMCurrentAcc mmCurrentAcc = new MMCurrentAcc(accNm, accNo, accBal, creditLimit);//Constructor for Initializing Saving Account from MM Bank faactory to get new Current account
		 return mmCurrentAcc;
	 }
}
