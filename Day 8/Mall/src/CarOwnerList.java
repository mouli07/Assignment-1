import java.util.ArrayList;
import java.util.List;

//class to implement the list of owners
public class CarOwnerList {

	private static int tokenNo;
	List<Parked_CarOwner> ownerDetails = new ArrayList<>();
	
	int add_new_car(Parked_CarOwner pcdtls)
	{
		ownerDetails.add(pcdtls);
		tokenNo++;
		return tokenNo;
	}
	
	//remove car from list
	void remove_car(int token)
	{

		System.out.println("\nCar To Be Romoved:-");
		
		ownerDetails.remove(token);
		
		System.out.println("--------------------------------");
		System.out.println("After Deletion");
		System.out.println("--------------------------------");
		
		ownerDetails.stream().forEach((Parked_CarOwner_Details) -> System.out.println("Owner Name : "+Parked_CarOwner_Details.getOwnerName()
		+"\nOwner Address : "+Parked_CarOwner_Details.getOwnerAddress()
		+"\nOwner Mobile No : "+Parked_CarOwner_Details.getOwnerMobileNo()
		+"\nCar Number : "+Parked_CarOwner_Details.getCarNO()
		+"\nCar Model : "+Parked_CarOwner_Details.getCarModel()
		+"\n-----------------------------------------------"));
		
		
	}

	//getting the location of the class
	String get_parked_car_location(int token)
	{
		String loc;
		int sec;
		//retrieving the floor and section
		if(token>240 && token<1)
		{
			loc = "Invalid input";
			return loc;
		}
		else if(token>=1 && token<=80)
		{			
			loc = "1st Floor ";
		}
		else if(token>=81 && token<=160)
		{
			token = token - 80;
			loc = "2nd Floor ";
		}
		else
		{
			token = token - 160;
			loc = "3rd Floor ";
		}
		sec =(int) Math.ceil(token/20.0);
		loc = loc + sec + " Section";
		
		return loc;
	}
}
