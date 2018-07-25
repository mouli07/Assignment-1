/*Program to remove duplicate characters present in a string*/
import java.util.Scanner;

public class Duplicatechar {
	
	public static void main(String args[])
	{
		String nodup="",str;			//nodup is the reference which refers to the final output without duplicate
	
		int i=0,len,j;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		str=sc.next();					//str refers to the input string
		len=str.length();
		str+="";						
		
		for(i=0;i<len;i++)				//Loops to Find out the common characters
		{
			for(j=0;j<i;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					break;
				}
			}
			if(i==j)					//If the positions are same then add the character to the final string
			{
				nodup+=str.charAt(i);
			}
		}
		
		System.out.println("The string after removing duplicate is " +nodup);
		
		
	}
			
}
