
public class GameTest {
	
	static void perform(Game g)
	{
		g.play();
	}
	public static void main(String args[])
	{
		Cricket c=new Cricket();
				perform(c);
		Football f=new Football();
				perform(f);
		Tennis t=new Tennis();
				perform(t);
	}

}
