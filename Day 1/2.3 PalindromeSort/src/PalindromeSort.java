import java.util.*;

public class PalindromeSort {
	
	static int i,c=0,j,temp;

	public static void main(String args[])
	{
		String rev="";
		String tp="";
		int i;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Words:\n");
		String[] words=new String[4];
		
		for(i=0;i<4;i++)
		{
			words[i]=sc.next();
			
		}
		String Palin[]=new String[4];
		int psize[]=new int[4];
		
		for(i=0;i<4;i++)
		{
			rev="";
			String copy=words[i];
			int n=words[i].length();
			for(int k=n-1;k>=0;k--)
			{
				rev=rev+(words[i].charAt(k));
			}
			
		
			if(copy.equals(rev))
			{
				System.out.println(copy+"is Palindrome");
				
				Palin[c]=copy;
				psize[c]=Palin[c].length();
				c++;
			}
		}
		
		for(i=0;i<c-1;i++)
		{
			for(j=0;j<c-i-1;j++)
			{
				if(psize[j]<psize[j+1])
				{
					temp=psize[j];
					psize[j]=psize[j+1];
					psize[j+1]=temp;
					
					tp=Palin[j];
					Palin[j]=Palin[j+1];
					Palin[j+1]=tp;
				}
			}
		}
		
		for(i=0;i<c;i++)
		   System.out.println(Palin[i]);
			
	}
}
