//derived class
public class sub1 extends base1
{
	private int i;
	private int j;
	
	//default constructor
	sub1()
	{
		super(18);
	}
	
	//one parameter constructor
	sub1(int i)
	{
		super(i);
		this.i = i;
		System.out.println("one param :: "+i);
	}
	
	//two parameter
	sub1(int i, int j)
	{
		super(j);
		
		this.i = i;
		this.j = j;
		
		System.out.println("Two param :: "+i+" "+j);
	}
}
