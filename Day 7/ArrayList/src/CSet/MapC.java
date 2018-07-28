package CSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("Tom", "Mango");
		map.put("Sam", "Banana");
		map.put("Harry", "Apple");
		map.put("Ritz", "Pomegranate");
		System.out.println(map.get("Tom"));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		Set<Entry<String,String>> set=map.entrySet();
		set.stream().forEach((element)->System.out.println(element.getValue()+" "+element.getKey()));
		}
}

