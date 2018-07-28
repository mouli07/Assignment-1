package CSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetC {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
	Set<String> nameSet=new TreeSet<String>();
	//adding names in an order
	nameSet.add("Tom");
	nameSet.add("Sam");
	nameSet.add("Ritz");
	nameSet.add("Harry");
	nameSet.stream().forEach((name)->System.out.println(name));
	}
	
}

