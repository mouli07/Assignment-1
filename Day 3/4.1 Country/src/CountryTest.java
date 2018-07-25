import java.util.*;

public class CountryTest {
	
	public static void main(String args[])
	{
		int n,i;
		String Cname[]=new String[100];
		int population[]=new int[100];
		int area[]=new int[100];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of countries you want to input: ");
		n=sc.nextInt();
		Country coun=new Country();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Country: ");
			Cname[i]=sc.next();
			System.out.println("\nEnter area: ");
			area[i]=sc.nextInt();
			System.out.println("\nEnter population: ");
			population[i]=sc.nextInt();
		}
		
		coun.setValue(n, Cname, population, area);
		coun.display();
	}

}
