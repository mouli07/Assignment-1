import java.util.*;

public class TriangleTest {

			public static void main(String args[])
			{
				int a,b,c;
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the three sides of the triangle: ");
				a=sc.nextInt();
				b=sc.nextInt();
				c=sc.nextInt();
				
				Triangle tri=new Triangle();
				tri.setVal(a, b, c);
				int n=tri.getValue();
				
				if(n==1)
				System.out.println("Right-angled triangle");
				
			else if(n==2)
					System.out.println("Scalene triangle");	
				
				else if(n==3)
					System.out.println("Isoceles triangle");
				
				else if(n==4)
					System.out.println("Equilateral triangle");
				
				else
					System.out.println("Not a triangle");
			}
}
