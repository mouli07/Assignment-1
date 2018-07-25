import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		     String num;
		     String rev="";
		     int i;
		     System.out.println("Enter the number:");
		     @SuppressWarnings("resource")
		     Scanner sc = new Scanner(System.in);
		     num=sc.next();
		          for(i=num.length() - 1;i>=0;i--)
		          {
		          rev=rev+num.charAt(i);   
		          }
		               if(rev.equals(num))
		               {
		               System.out.println("Palindrome");
		               }
		               else
		               {
		               System.out.println("Not Palindrome");
		               }
		     
	    

}
}
