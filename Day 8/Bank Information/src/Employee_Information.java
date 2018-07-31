//Class defining employee information
public class Employee_Information {
	
	int empID;
	private String Employee_name;
	private String employee_designation;
	private double Employee_salary;
	private String employee_comm;
	
	//Constructor
	public Employee_Information(int empID, String employee_name, String employee_designation, double employee_salary,
			String employee_comm) {
		this.empID = empID;
		Employee_name = employee_name;
		this.employee_designation = employee_designation;
		Employee_salary = employee_salary;
		this.employee_comm = employee_comm;
	}

	//Getters
	public int getEmpID() {
		return empID;
	}


	public String getEmployee_name() {
		return Employee_name;
	}


	public String getEmployee_designation() {
		return employee_designation;
	}


	public double getEmployee_salary() {
		return Employee_salary;
	}


	public String getEmployee_comm() {
		return employee_comm;
	}


	@Override
	public String toString() {
		return "Employee_Information [empID=" + empID + ", Employee_name=" + Employee_name + ", employee_designation="
				+ employee_designation + ", Employee_salary=" + Employee_salary + ", employee_comm=" + employee_comm
				+ "]";
	}
	
	
	
	
	
	

}
