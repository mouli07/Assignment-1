package Employee;


public class Employee {
	
	String ID;
	String empName;
	double Salary;
	
	
	public Employee(String iD, String empName, double salary) {
		ID = iD;
		this.empName = empName;
		Salary = salary;
	}


	public String getID() {
		return ID;
	}


	public String getEmpName() {
		return empName;
	}


	public double getSalary() {
		return Salary;
	}
	

	
	

}
