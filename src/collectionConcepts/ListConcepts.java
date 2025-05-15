package collectionConcepts;

import java.util.*;

public class ListConcepts {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>(); //create list
		list.add("Revathy");
		list.add("Prithvi");
		list.add("siva");
		list.add("Jeni");
		list.add("tamil");
		list.add("prithvi");
		
		for (String mylist : list) {
			System.out.println("My name list  "+mylist);
			
		}
		
		boolean obj = list.contains("Revathy"); //check whether the value is present or not
		System.out.println(obj);
		
		//check all the values are present or not
		List <String> list1 = new LinkedList<String>(); //create list
		list1.add("Revathy");
		list1.add("Prithvi");
		list1.add("siva");
		list1.add("Jeni");
		list1.add("tamil");
		list1.add("prithvi");
		
//		for (String newlist : list1) {
//			System.out.println(newlist);
//			
//		}
		System.out.println(list.containsAll(list1));
		
		if(list.equals(list1)) 
			System.out.println("this is equal");
			
		else
			System.out.println("This is not equal");
			
		System.out.println("To get value from index "+list1.get(5) );
		
		System.out.println("to get index from values "+list1.indexOf("tamil"));
		
		System.out.println("To get last index value "+list1.lastIndexOf("prithvi"));
		
		System.out.println("To get size of the list "+list1.size());
		//list1.clear();
		System.out.println("To check list is empty "+list1.isEmpty());
		
		System.out.println("To clear particular index "+list1.remove(4));
		
		

	}

}
