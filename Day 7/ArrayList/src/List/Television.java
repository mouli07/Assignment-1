/*Definition of Television features*/
package List;

public class Television {
	
	String company;
	String Type;
	Boolean enable;
	double price;
	
	public Television(String company, String type, Boolean enable, double price) 			//Constructor
	{
		this.company = company;
		Type = type;
		this.enable = enable;
		this.price = price;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public String getType()
	{
		return Type;
	}
	
	public Boolean getEnable()
	{
		return enable;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	

}
