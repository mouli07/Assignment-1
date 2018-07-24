//Child class having multilevel inheritance
class Child extends Parent
{
	//Non-arg constructor
	Child()
	{
		super(10,20.5); //invoking parent class constructor
		System.out.println("Child Constructor");
	}
}
