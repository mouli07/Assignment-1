/*Child class inheriting SingleLevel*/
public class SecondLevel extends SingleLevel{
	
	int j=2;
	
	void display()
	{
	System.out.println("Second level");
	}
	
	SecondLevel()
	{
		super();
		System.out.println("Constructor for Second Level");
		
	}
	
	

}
