//Abstract class BankAcc for Generalization
public abstract class BankAcc {

	private String accNm;
	private int accNo;       
	private float accBal;
	
	protected String getAccNm() {
		return accNm;
	}

	protected void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	protected int getAccNo() {
		return accNo;
	}

	protected void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	protected float getAccBal() {
		return accBal;
	}

	protected void setAccBal(float accBal) {
		this.accBal = accBal;
	}
		
	
	public BankAcc(String accNm, int accNo, float accBal) {
		this.accNm = accNm;
		this.accNo = accNo;
		this.accBal = accBal;
	}

	public void withdraw(float amount) {
		accBal -= amount;
	}
	
	public void deposit(float amount)
	{
		accBal += amount;
	}

	@Override
	public String toString() {
		return "BankAcc [accNm=" + accNm + ", accNo=" + accNo + ", accBal=" + accBal + "]";
	}
	

	
}
