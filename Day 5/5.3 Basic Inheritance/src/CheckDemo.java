
public class CheckDemo {
	
	public static void main(String args[])
	{
		Check chck=new Check();
	
		
		System.out.println("Default Variable : " +chck.defaultvar);          //Default,public and protected can be accessed directly.
		System.out.println("Public Variable : " +chck.publicvar);
		System.out.println("Protected Variable : " +chck.protectedvar);
		
		
		chck.display();															//private needs to be accessed indirectly.
	}

}
