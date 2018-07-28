/*Definition of laptop features*/
package List;

public class Laptop {
	
	String company;
	String model;
	String OperatingSystem;
	String processor;
	
	public Laptop(String company, String model, String OperatingSystem, String processor)		//Constructor
	{
		this.company=company;
		this.model=model;
		this.OperatingSystem=OperatingSystem;
		this.processor=processor;
	}
	
	public String getCompany()							
	{
		return company;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getOperatingSystem()
	{
		return OperatingSystem;
	}
	
	public String getProcessor()
	{
		return processor;
	}
	

}
