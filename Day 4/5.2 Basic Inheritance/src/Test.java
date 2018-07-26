
public class Test {

	public static void main(String args[])
	{
		Member.method1();								//Calling static method
		Member memberobj = new Member();
		memberobj.method2();							//Calling non-static method
		
	}
}
