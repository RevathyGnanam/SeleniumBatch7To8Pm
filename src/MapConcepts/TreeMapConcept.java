package MapConcepts;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
	Map<String,Integer> map = new TreeMap<String,Integer>();
		
		map.put("Balu", 400);
		map.put("Somu", 200);
		map.put("Tina", 70000);
		map.put("Sera", 400);
		
		System.out.println("Print the linked hash map: "+map);
		
		map.remove("Sera");
		System.out.println("Print the linked hash map: "+map);

	}

}
