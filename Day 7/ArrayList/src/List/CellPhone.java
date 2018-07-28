/*Definition of Cell Phone features*/
package List;

public class CellPhone {

	String company;
	String model;
	String description;
	String OperatingSystem;
	double Price;
	
	public CellPhone(String company,String model,String description,String OperatingSystem, double Price)		//Constructor
	{
		this.company=company;
		this.model=model;
		this.description=description;
		this.OperatingSystem=OperatingSystem;
		this.Price=Price;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getOperatingSystem()
	{
		return OperatingSystem;
	}
	
	public double getPrice()
	{
		return Price;
	}
	
}
