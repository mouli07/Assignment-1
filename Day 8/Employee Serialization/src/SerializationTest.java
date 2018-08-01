/*Class to perform Serialization*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	
	public static void main(String args[])
	{
		Employee emp=new Employee(101,"Tom",10000.00);
		
		try
		{
			FileOutputStream fos= new FileOutputStream("employee.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			oos.writeObject(emp);
			System.out.println("Serialization successful");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
