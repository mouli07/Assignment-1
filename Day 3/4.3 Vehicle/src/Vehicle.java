
public class Vehicle {
	
	private int cspeed,cdirection;
	private String owner;
	private static int highestvid=1000;
	
	public static int getHighestvid()
	{
		return highestvid-1;
	}
	
	private int vehiID;
	
	protected static final int TURN_LEFT=0;
	protected static final int TURN_RIGHT=1;
	
	public Vehicle()
	{
		vehiID=highestvid;
		highestvid++;
		owner="Unspecified(Test Car)";
		
	}
	
	public Vehicle(String nameOfOwner)
	{
		this();
		owner=nameOfOwner;
	}
	
	public int getSpeed()
	{
		return cspeed;
	}
	
	public void setSpeed(int cspeed)
	{
		this.cspeed=cspeed;
	}
	
	public int getDirection()
	{
		return cdirection;
	}
	
	public void setDirection(int direction)
	{
	 cdirection=direction;
	 if(cdirection<0)
		 cdirection+=360;
	 cdirection %= 360;
	}
	
	public void stop()
	{
		setSpeed(0);
	}
	
	public void turnSide(int sd)
	{
		setDirection((sd==0)?((cdirection-90)%360):((cdirection+90)%360));
		
	}
	
	public String toString()
	{
		return "Vehicle [cspeed=" + cspeed + ", direction=" +cdirection+ ", Owner Name=" +owner+ ", VehicleID=" +vehiID + "]";
		
	}
	
	
	
	
	
	
	

}
