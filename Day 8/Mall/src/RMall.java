public class RMall {

	public static void main(String[] args)
	{		
		
		
		//instantiating the class and calling the constructor
		Parked_CarOwner pl = new Parked_CarOwner("Tom","Kolkata","1234567890","Kwid","WB123456");
		Parked_CarOwner pl1 = new Parked_CarOwner("Sam","Mumbai","1234789056","Alto","MH345612");
		Parked_CarOwner pl2 = new Parked_CarOwner("Harry","Bangalore","34789056102","WagonR","KN345612");
		Parked_CarOwner pl3 = new Parked_CarOwner("Garry","Pune","1789056","Sumo","MH361245");
		CarOwnerList ol = new CarOwnerList();
		
		//calling the add function and displaying the token number of each addition
		System.out.println(ol.add_new_car(pl));
		System.out.println(ol.add_new_car(pl1));
		System.out.println(ol.add_new_car(pl2));
		System.out.println(ol.add_new_car(pl3));
		
		
		//location of the specific car in the parking lot
		System.out.println(ol.get_parked_car_location(2));
		
		//removing the car and displaying the resultant list
		ol.remove_car(2);
	}

}