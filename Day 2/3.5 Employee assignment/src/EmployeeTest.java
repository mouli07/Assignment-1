import java.util.*;


public class EmployeeTest {
	
	public static void main(String args[])
	{
	
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee ID:");
	int id=sc.nextInt();
	System.out.println("Enter the Employee Name:");
	String name=sc.next();
	System.out.println("Enter the Basic salary:");
	float bsal=sc.nextFloat();
	Employee emp=new Employee();
	
	emp.setmonthlyBasic(bsal);
	
    emp.getIdname(id,name);
    
    emp.display();
      
     
	
	
	}

}
