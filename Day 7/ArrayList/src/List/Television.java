package List;

public class Television {
	
	String company;
	String Type;
	Boolean enable;
	String price;
	
	public Television(String company, String type, Boolean enable, String price) {
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
	
	public String getPrice()
	{
		return price;
	}
	
	
	

}
