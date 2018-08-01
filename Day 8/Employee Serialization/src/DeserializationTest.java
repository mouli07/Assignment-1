/*Class to perform Deserialization*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {

	public static void main(String args[])
	{
		Employee emp;
		try(FileInputStream fis=new FileInputStream("employee.txt");
				ObjectInputStream ois = new ObjectInputStream(fis))
		{
			try {
				emp=(Employee) ois.readObject();
				System.out.println(emp);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
