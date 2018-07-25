/*Program to add two distances*/
public class Distance {
	
	int feet;
	float inches;
	
	void set(int ft,float inch)
	{
		feet=ft;
		inches=inch;
	}
	
	void disp()
	{
		System.out.println("The distance is " +feet+ "feet " +inches+ "inches");
	}
	
	Distance add(Distance dist1,Distance dist2,Distance result)
	{
		result.feet=dist1.feet + dist2.feet;
		result.inches=dist1.inches + dist2.inches;
		if(result.inches>=12)                          //1 feet=12 inches . So when inches are more than 12, it is divided by 12.
		{
			result.feet+= (result.inches/12);
			result.inches%=12;
					
		}
		return result;
	}

}
