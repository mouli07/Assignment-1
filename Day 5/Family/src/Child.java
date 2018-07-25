//Child class implementation
public class Child extends Parent1 implements Parent2 {

	void display()
	{
		System.out.println("Child");
	}
	
	@Override
	public void displayTwo()
	{
		System.out.println("From interface");
	}
}
