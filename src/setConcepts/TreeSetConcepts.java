package setConcepts;

import java.util.*;

public class TreeSetConcepts {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Apple");
		set.add("Pine");
		set.add("Mango");
		set.add("grape");
		set.add("grape");
		
		
		
		for (String fruits : set) {
			System.out.println(fruits);

		}

	}

}
