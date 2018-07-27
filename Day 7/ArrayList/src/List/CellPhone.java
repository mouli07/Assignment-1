package List;

public class CellPhone {

	String company;
	String model;
	String description;
	String OperatingSystem;
	
	public CellPhone(String company,String model,String description,String OperatingSystem)
	{
		this.company=company;
		this.model=model;
		this.description=description;
		this.OperatingSystem=OperatingSystem;
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
	
}
