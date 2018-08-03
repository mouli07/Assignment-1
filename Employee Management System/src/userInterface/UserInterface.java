package userInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controller.Controller;
import Employee.Employee;

public class UserInterface {

	List<Employee> empList;
	Controller ctrlr;
	
	public void start() throws NumberFormatException, IOException {
		
		
		empList = new ArrayList<>();
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Controller ctrl=(Controller) context.getBean("controller");
		
		
		display();
	}
	
	
	
	public void display()
	{
		do
		{
		System.out.println("1.Add Employee \n 2.View All Employee \n3.Get Employee By ID \n4.Delete Employee \n5. Exit \nEnter Your Choice");
		Scanner sc=new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("Enter the emp name");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String id=br.readLine();
				String name=br.readLine();
				double salary=br.read();
				Employee emp=new Employee(id, name, salary);
				empList.add(emp);
				ctrlr.addEmployee(empList);
		break;
		}
		}while(true);
	}
}
