package DataLayer;

import java.util.ArrayList;
import java.util.List;

import Employee.Employee;


public class DataLayer {
	
	List<Employee> empList = new ArrayList<>();
	
	public void addEmployee(List<Employee> empList2)
	{

		Employee e = new Employee(((Employee) empList).getID(), ((Employee) empList).getEmpName(), ((Employee) empList).getSalary());
		empList.add(e);
	}
	
	public List<Employee> viewallEmp()
	{
		return empList;
	}
	
	public Employee getempById(String ID)
	{
		for(Employee employee : empList)
			if(employee.getID().equals(ID))
				return employee;
		
		return null;
	}
	
	public void deleteEmp(String id)
	{
		for(Employee employee : empList)
			if(employee.getID().equals(id))
				empList.remove(employee);
				
	}
	
	
	

}
