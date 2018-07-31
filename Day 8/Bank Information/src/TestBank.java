//Test Class For HashMap implementation
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class TestBank {
	
	public static void main(String args[])
	{
		Employee_Information eInfo1=new Employee_Information(123,"Ricky","Manager",100000.00,"abcd");
		MMASaving saving1=new MMASaving(4556,"Ricky", 4000000.00, true);
		
		Employee_Information eInfo2=new Employee_Information(124,"Bob","Developer",120000.00,"hsbc");
		MMASaving saving2=new MMASaving(4558,"Bob", 4500000.00, true);
		
		Employee_Information eInfo3=new Employee_Information(125,"Anna","Analyst",10000.00,"bcde");
		MMASaving saving3=new MMASaving(4557,"Anna", 4700000.00, true);
		
		Employee_Information eInfo4=new Employee_Information(126,"Emma","HR Manager",1100000.00,"abcd");
		MMASaving saving4=new MMASaving(4559,"Emma", 7000000.00, true);
		
		Employee_Information eInfo5=new Employee_Information(127,"Vicky","Team Lead",1200000.00,"abcd");
		MMASaving saving5=new MMASaving(4660,"Vicky", 4900000.00, true);
		
		Map<Employee_Information,MMASaving> map=new HashMap<Employee_Information,MMASaving>();
		map.put(eInfo1, saving1);
		map.put(eInfo2, saving2);	
		map.put(eInfo3, saving3);	
		map.put(eInfo4, saving4);	
		map.put(eInfo5, saving5);	                                                                                                                                                   
		
		
		Set<Entry<Employee_Information,MMASaving>> set=map.entrySet();
		set.stream().forEach((element)->System.out.println(element.getValue()+" "+element.getKey()));
		
	}
	
	
	
	

}
