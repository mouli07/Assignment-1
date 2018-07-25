/*Class with main method for evaluating Rectangle behavior*/
import java.util.*;

public class Shape {
			
		public static void main(String args[])
		{
			System.out.println("Enter the number of rectangle(1 or 2)");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			double len1,btd1,len2,btd2,area1,peri1,area2,peri2;
			Rectangle rect1=new Rectangle();      //rect1 is the reference for the first rectangle
			Rectangle rect2=new Rectangle();	  //rect2 is the reference for the second rectangle
			
			
			System.out.println("Enter the length of the Rectangle: \n");
			len1=sc.nextDouble();
			System.out.println("Enter the breadth of the Rectangle: ");
			btd1=sc.nextDouble();
			
			if(n==2)                      //if the number of rectangle is 2 then this block is executed
			{
				System.out.println("Enter the length of the Rectangle: \n");
				len2=sc.nextDouble();
				System.out.println("Enter the breadth of the Rectangle: ");
				btd2=sc.nextDouble();
				
				area2=rect2.area(len2,btd2);      //area of rectangle 2
				peri2=rect2.peri(len2,btd2);	  //perimeter of rectangle 2
			
				area1=rect1.area(len1,btd1);	  //area of rectangle 1
				peri1=rect1.peri(len1,btd1);	  //perimeter of rectangle 1
			
				System.out.println("Area of rectangle1 " +area1);
				System.out.println("\nPerimeter of rectangle1 " +peri1);
			
				System.out.println("Area of rectangle2 " +area2);
				System.out.println("\nPerimeter of rectangle2 " +peri2);
				
				if(area1==area2)
				{
					System.out.println("Both the rectangles have same area");
				}
				else
				{
					System.out.println("Areas are different");
				}
			}
			else
			{
				area1=rect1.area(len1,btd1);
				peri1=rect1.peri(len1,btd1);
			
				System.out.println("Area of rectangle1 " +area1);
				System.out.println("\nPerimeter of rectangle1 " +peri1);
			}
			
			
			
		}
}
