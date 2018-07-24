//Driver program to call the objects of the children
public class TestShape {

	public static void main(String[] args)
	{
		
		Shape ar[] = new Shape[3];
		
		ar[0] = new Triangle();
		ar[1] = new Polygon();
		ar[2] = new Circle();
		
		ar[0].draw();
		ar[1].draw();
		ar[2].draw();

	}

}
