package setConcepts;

import java.util.*;

public class LinkedHashSetConcepts {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Pine");
		set.add("grape");
		set.add("grape");
		
		
		
		for (String fruits : set) {
			System.out.println(fruits);

		}

	}

}
