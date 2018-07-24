
public abstract class CurrentAcc extends BankAcc{

	private final float CreditLimit;
	
	public CurrentAcc(String accNm, int accNo, float accBal, float creditLimit) {
		super(accNm, accNo, accBal);
		CreditLimit = creditLimit;
	}
 

	protected float getCreditLimit() {
		return CreditLimit;
	}


	@Override
	public void withdraw(float amount)
	{
		if(amount > getAccBal()+CreditLimit)   // if Above limit for Current then show error message
		{ 
			System.out.println("Error Cannot withdraw Above Limit...");
		}
		
		else
			setAccBal(getAccBal()-amount);
	}


	@Override
	public String toString() {
		return "CurrentAcc [CreditLimit=" + CreditLimit + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	
	
	
}
