package ServiceLayer;

import java.util.List;

import DataLayer.DataLayer;
import Employee.Employee;

public class ServiceLayer {

	DataLayer dl=new DataLayer();
	public void addEmployee(List<Employee> empList)
	{
		dl.addEmployee(empList);
	}
	

	public List<Employee> viewallEmp()
	{
		return dl.viewallEmp();
	}
	
	public Employee getempById(String ID)
	{
		return dl.getempById(ID);
	}
	
	public void deleteEmp(String id)
	{
		dl.deleteEmp(id);
				
	}
}
