import java.util.*;

public class RevSentence {
	
	public static void main(String args[])
	{
		String reverse="";
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:\n");
		String str=sc.nextLine();
		str=str+" ";
		char ch;
		
		int length;
		length=str.length();
		for(int i=0;i<length;i++)
		{
			ch=str.charAt(i);
			
			if(ch==' ')
			{
				System.out.println(reverse+" ");
				reverse="";
			}
			
			else
			{
				reverse=ch+reverse;
			}
				
		}
	}
	
	
	

}
