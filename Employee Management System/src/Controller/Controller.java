package Controller;

import java.util.List;

import Employee.Employee;
import ServiceLayer.ServiceLayer;

public class Controller {
	
	ServiceLayer sl=new ServiceLayer();
	public void addEmployee(List<Employee> empList)
	{
		sl.addEmployee(empList);
		
	}
	

	public List<Employee> viewallEmp()
	{
		return sl.viewallEmp();
	}
	
	public Employee getempById(String ID)
	{
		return sl.getempById(ID);
	}
	
	public void deleteEmp(String id)
	{
		sl.deleteEmp(id);
				
	}

}
