/*Definition of car features*/
package List;

public class Car implements Comparable<Car>{

	String make;
	String model;
	int year;
	double price;
	
	public Car(String make,String model,int year,double price)						//Constructor
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

	@Override
	public int compareTo(Car c) {
		// TODO Auto-generated method stub
		return this.make.compareTo(c.make);
	}
}
