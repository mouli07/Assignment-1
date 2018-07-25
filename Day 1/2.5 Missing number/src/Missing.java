/*Program to find the missing number from a given array*/
import java.util.Scanner;

public class Missing {
	
	public static void main(String args[])
	{
		int n,i,j,temp;
		System.out.println("Enter the size of the array:");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();          /*Variable to store the number of elements in the array*/
		int arr[]=new int[n];    /*Array to store the input*/
		int num[]=new int[n+1];  /*Another array to store numbers sequentially*/
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n+1;i++)
		{
			num[i]=i;
		}
		for(i=0;i<n;i++)           /*Sorting the input array*/
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(i=0;i<n+1;i++)         /*Compare the sorted input array and the array with sequential number*/
		{
			if(arr[i]!=num[i])
			{
				break;
			}
		}
		System.out.println("The missing number is " +i); 
		
	}

}
