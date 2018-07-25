/*Program to add two time objects*/
import java.util.*;
import java.io.*;

public class TimeTest {
	
	public static void main(String args[])throws IOException
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int hr1,hr2,min1,min2;
		System.out.println("Enter the Time1");
		hr1=sc.nextInt();
		min1=sc.nextInt();
		
		System.out.println("Enter the Time2");
		hr2=sc.nextInt();
		min2=sc.nextInt();
		
		Time t1=new Time();							//Creating 3 objects. Two for time and one for the result
		Time t2=new Time();
		Time addres=new Time();
		
		t1.setTime(hr1, min1);						//Setting the time
		t2.setTime(hr2, min2);
		
		addres.sum(t1, t2, addres);
		
		t1.showTime();								//Displaying the time and their summation.
		t2.showTime();
		addres.showTime();
	}

}
