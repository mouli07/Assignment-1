
public class MMSavingAcc extends SavingAcc{
	
	

	public MMSavingAcc(String accNm, int accNo, float accBal, boolean isSalary) {
		super(accNm, accNo, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amount)
	{
		if(amount>getAccBal())   // if Above limit for saving acc then show error message
		{
			System.out.println("Error cannot withraw below limit.....");
		}
		else
		{   
			setAccBal(getAccBal()-amount);
		}   		
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
				+ ", getAccBal()=" + getAccBal() + "]";
	}

    
	
}
