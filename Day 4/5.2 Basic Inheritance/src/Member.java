/*Program to create static and non-static members and access them */
public class Member {
	
	int nstatic=9;
	static int ystatic=8;
	
	static void method1()									//Static method
	{
		System.out.println("Static method" +ystatic);
	}
	
	void method2()											//Non-static method
	{
		System.out.println("Non-static method" +nstatic);
		
	}
	

	
}
