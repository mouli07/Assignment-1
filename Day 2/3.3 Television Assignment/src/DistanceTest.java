/*Class containing main function to calculate the sum of two  distances*/
import java.util.*;

public class DistanceTest {
	
			public static void main(String args[])
			{
				int feet1,feet2;
				float inches1,inches2;
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the distance1");
				feet1=sc.nextInt();
				inches1=sc.nextFloat();
				
				System.out.println("Enter the distance2");
				feet2=sc.nextInt();
				inches2=sc.nextFloat();
				
				Distance dist1=new Distance();             //Create 3 different object . First two for two distances and the third one to add the result.
				Distance dist2=new Distance();
				Distance addres=new Distance();
				
				dist1.set(feet1, inches1);                 //setting the values
				dist2.set(feet2, inches2);
				
				addres.add(dist1, dist2, addres);         //passing parameters to the add function.
				
				dist1.disp();
				dist2.disp();
				addres.disp();
				
				
			}

}
