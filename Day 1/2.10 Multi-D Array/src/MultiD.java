import java.util.*;

public class MultiD {

			public static void main(String args[])
			{
				int i,j,flag=0;
				int arr[][]=new int [2][2];
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the array elements:");
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						arr[i][j]=sc.nextInt();
					}
				}
				
				System.out.println("Enter the target element:");
				int target=sc.nextInt();
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						if(arr[i][j]==target)
						{
							flag=1;
						}
					}
				}
				
				if(flag==1)
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}
}
