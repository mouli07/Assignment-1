
public abstract class SavingAcc extends BankAcc{
	
	private boolean isSalary;
	private final static float MINBAL=2000 ; 
	
	public SavingAcc(String accNm, int accNo, float accBal, boolean isSalary) {
		super(accNm, accNo, accBal);
		this.isSalary = isSalary;
	}

	

    public boolean isSalary() {
		return isSalary;
	}

 	
 	public static float getMinbal() {
		return MINBAL;
	}
 	
	@Override
	public void withdraw(float amount)
	{
		if(amount>getAccBal())
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
		return "SavingAcc [isSalary=" + isSalary + ", isSalary()=" + isSalary() + "]";
	}
	
	

}
