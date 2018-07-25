import java.util.*;
import java.io.*;

public class Test {
		
		public static void main(String args[])throws IOException
		{
			float real1,real2,imaginary1,imaginary2;
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the real and imaginary part of the first number:");
			real1=sc.nextFloat();
			imaginary1=sc.nextFloat();
			
			System.out.println("Enter the real and imaginary part of the second number:");
			real2=sc.nextFloat();
			imaginary2=sc.nextFloat();
			
			Complex num1 = new Complex();     //Creating 3 objects for the two numbers and the result respectively
			Complex num2 = new Complex();
			Complex result=new Complex();
			
			
			num1.set(real1, imaginary1);		//Setting the value 
			num2.set(real2, imaginary2);
			
			result.sum(num1, num2, result);
			
			num1.disp();
			num2.disp();
			result.disp();
			
			
			
		}
}
