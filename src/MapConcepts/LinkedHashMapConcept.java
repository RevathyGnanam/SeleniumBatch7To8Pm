package MapConcepts;

import java.util.*;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		map.put("Balu", 400);
		map.put("Somu", 200);
		map.put("Tina", 70000);
		map.put("Sera", 400);
		
		System.out.println("Print the linked hash map: "+map);
		
		//to set the values
		for (Map.Entry<String, Integer> e: map.entrySet()) {
			if(e.getKey().equals("Somu"))
				e.setValue(1000);
				
			
		}
		System.out.println("After updating Print the linked hash map: "+map);
		
		
	}

}
