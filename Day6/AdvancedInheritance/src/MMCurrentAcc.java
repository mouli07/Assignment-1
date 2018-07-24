
public class MMCurrentAcc extends CurrentAcc{
	
public MMCurrentAcc(String accNm, int accNo, float accBal, float creditLimit) {
		super(accNm, accNo, accBal, creditLimit);
	}

public void withdraw(float amount)
{
	if(amount > getAccBal()+getCreditLimit()) // if Above limit for Current then show error message
	{
		System.out.println("Error Cannot withdraw Above Limit...");
	}
	
	else
		setAccBal(getAccBal()-amount);
}

@Override
public String toString() {
	return "MMCurrentAcc [getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo() + ", getAccBal()=" + getAccBal()
			+ "]";
}



}
