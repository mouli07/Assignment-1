/*Test class for calling the objects of the children*/
public class ShapeDemo {
	
	public static void main(String args[])
	{
		Shape shape[]=new Shape[3];
		shape[0]=new Circle();
		shape[1]=new Polygon();
		shape[2]=new Rectangle();
		
		shape[0].draw();
		shape[1].draw();
		shape[2].draw();
		
		
	}

}
