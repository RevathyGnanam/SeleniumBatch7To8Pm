package collectionConcepts;

import java.util.*;

public class ArrayToListAndSort {

	public static void main(String[] args) {
		String[] arrayList = {"Revathy","Tamil","Prithvi"};
		System.out.println(Arrays.toString(arrayList));
		
		List<String> list = new ArrayList<String>();
		for (String mynewlist : arrayList) {
			list.add(mynewlist);
						
		}
		
Collections.sort(list);

System.out.println("Newlist "+list);
	}

}
