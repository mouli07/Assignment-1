/*Program to calculate employee salary*/
public class Employee {
	
	private int Id;
	private String name;
	private float monthlyBasic;
	private static final float medallowance=1250F;
    private static float hra=0.5F;
    private static final float conallowance=800F;
    private float PF;
    private float Esic = 0.0F;
    private float tax;
    
    void getIdname(int Id,String name)				//Method to get the name and the employee Id
    {
    	this.Id=Id;
    	this.name=name;
    }
    
    void setmonthlyBasic(float mbasic)				//Method to get monthlyBasic
    {
    	monthlyBasic=mbasic;
    	
    }
    
    float getAnnualBasic()					//Method to get AnnualBasic
    {
    	return 12*monthlyBasic;
    }
    
    float getMonthlyGrossSalary()				//Method to calculate MonthlyGrossSalary
    {
    	hra= 0.5F * monthlyBasic;
    	
    	return monthlyBasic + hra + medallowance + conallowance;
    }
    
    
    float getAnnualGrossSalary()				//Method to calculate Annual Gross Salary
    {
    	return 12*getMonthlyGrossSalary();
    }
    
    float getMonthlyDeductions()				//Method to calculate Monthly Deductions
    {
    	PF= 0.1F * monthlyBasic;
    	if(PF>6500F)
    	{
    		PF=6500F;
    	}
    	if(monthlyBasic <= 5000F)
    	{
    		Esic = 0.0475F * monthlyBasic;
    		
    	}
    	
    	if(getMonthlyGrossSalary()<=10000)
    	{
    		tax=50F;
    	}
    	else
    	{
    		tax=100F;
    	}
    	
    	return getPFRate()+Esic+tax;
    }
    
    float getMonthlyTakeHome()						//Method to calculate monthly Take away amount
    {
    	return getMonthlyGrossSalary()-getMonthlyDeductions();
    }
    
    float getAnnualTakeHome()						//Method to calculate annual Take away 
    {
    	return 12*getMonthlyTakeHome();
    }
    
    float getPFRate()							//Method to get Provident fund amount
    {
    	return PF;
    }
    
    void setPFRate(float f)						//Method to set PF rate
    {
    	f= 0.1F * monthlyBasic;
    	if(f>6500F)
    	{
    		f=6500F;
    	}
    	PF=f;
    }
    
    public void display()
    {
    	System.out.println("Employee Id:" +Id);
        System.out.println("Employee Name:" +name);
    	System.out.println("Monthly basic: " +monthlyBasic);
    	System.out.println("Annual basic: " +getAnnualBasic());
    	System.out.println("Monthly Gross: " +getMonthlyGrossSalary());
    	System.out.println("Annual Gross: " +getAnnualGrossSalary());
    	System.out.println("Monthly Deductions: " +getMonthlyDeductions());
    	System.out.println("Monthly Take Home: " +getMonthlyTakeHome());
    	System.out.println("Annual Take Home: " +getAnnualTakeHome());
    	
    	
    	
    	
    }
    
	
	

}
