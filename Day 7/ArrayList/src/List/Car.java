package List;

public class Car {

	String make;
	String model;
	int year;
	double price;
	
	public Car(String make,String model,int year,double price)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.price=price;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public double getPrice()
	{
		return price;
	}
}
