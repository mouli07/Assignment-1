import java.util.*;

public class Discount {

			public static void main(String args[])
			{
				
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
						System.out.println("Enter the price of the item:");
						double val=sc.nextDouble();
						System.out.println("Enter the discount %:");
						int discount=sc.nextInt();
						double newItem;
						newItem=(discount*val)/100;
						double newItemPrice=val-newItem;
						System.out.println("The selling price of the item is Rs. " +newItemPrice);
						
						
			}
}
