//driver program to create instances
class Caller {

	public static void main(String args[])
	{
		Parent parent = new Parent();	//creating object of parent class
		
		System.out.println("\nFrom Main With Child Object");
		Child child = new Child();		//creating object of child class
	}
}
