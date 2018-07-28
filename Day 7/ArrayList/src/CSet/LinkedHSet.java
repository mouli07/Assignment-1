package CSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHSet {
	
	public static void main(String[] args)
	{
		Set<String> nameSet = new LinkedHashSet<String>();
		//adding names in an order
		nameSet.add("Tom");
		nameSet.add("Sam");
		nameSet.add("Ritz");
		nameSet.add("Harry");
		nameSet.stream().forEach((name) -> System.out.println(name));
	}
}
