/*Program to access variables with different access specifiers*/
public class Check {
	
	int defaultvar=10;
	private int privatevar=20;
	public int publicvar=30;
	protected int protectedvar=40;
	
	public void display()
	{
		
		System.out.println("Private Variable : " +privatevar);
		
	}

}
