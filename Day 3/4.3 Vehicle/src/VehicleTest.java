
public class VehicleTest {
	
	public static void main(String args[])
	{
		Vehicle vehi1=new Vehicle();
		Vehicle vehi2=new Vehicle();
		
		Vehicle vehi3=new Vehicle("BMW");
		
		vehi3.setSpeed(80);
		
		vehi1.setDirection(180);
		
		vehi3.turnSide(Vehicle.TURN_RIGHT);
		
		vehi2.setSpeed(80);
		vehi2.setDirection(180);
		vehi2.turnSide(Vehicle.TURN_LEFT);
		
		System.out.println("The highest vehicle serial number so far" +Vehicle.getHighestvid());
		
		System.out.println("The current state of all vehicles are:");
		System.out.println(vehi1);
		System.out.println(vehi2);
		System.out.println(vehi3);
		
		
		
		
	}

}
