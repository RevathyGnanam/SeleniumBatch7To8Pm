package MapConcepts;

import java.util.*;

public class HashMapConcept {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//Inserting the data using put method
		map.put("Revathy", 100);
		map.put("Tamil", 200);
		map.put("Prithv", 300);
		map.put("jeni", 400);
		map.put("Siva", 500);
		
		System.out.println("List the students name and rollNo: "+map);
		
		//Iterating over map
		for (Map.Entry<String, Integer> newmap: map.entrySet()) {
			
			System.out.println("Print the key::"+newmap.getKey() +" "+ "Print the values::"+newmap.getValue());
			
		}
		

	}

}
