//Driver program to test the interface and its implementation
public class Demo {

	//method to invoke the child class functions
	static void perform(Game gm)
	{
		gm.play();
	}
	
	//To create the objects and call the perform(
	public static void main(String[] args)
	{
		Game gm = new Cricket();
		perform(gm);
		
		gm = new FootBall();
		perform(gm);
		
		gm = new Tennis();
		perform(gm);
	}

}
