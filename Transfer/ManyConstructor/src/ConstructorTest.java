//Driver program to instantiate sub1
public class ConstructorTest {

	public static void main(String[] args)
	{
		sub1 s1 = new sub1();
		System.out.println("---------------------");
		s1 = new sub1(20);
		System.out.println("---------------------");
		s1 = new sub1(10,20);
		System.out.println("---------------------");
	}

}
