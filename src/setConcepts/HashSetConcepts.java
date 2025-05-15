package setConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Pine");
		set.add("grape");
		set.add("grape");
		
		for (String fruits : set) {
			System.out.println(fruits);

		}
		boolean contains = set.contains("Pine");
		System.out.println(contains);
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
	//	set.clear();
		//System.out.println(set.size());
		
		//how to change list to use get function
		
		List<String> myList = new ArrayList<String>(set);
		
		for (String MynewList : myList) {
			System.out.println(MynewList);
		}
		String str = myList.get(0);
		System.out.println(str);
		
	}

}
