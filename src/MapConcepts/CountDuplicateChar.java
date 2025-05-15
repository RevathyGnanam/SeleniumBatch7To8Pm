package MapConcepts;

import java.util.*;
import java.util.Map.Entry;

public class CountDuplicateChar {

	public static void main(String[] args) {
	
		String givenString = "WelcomeToJava";
		
		//Output: a=2;e=2
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		char[] repeatedString = givenString.toCharArray();
		for (char c : repeatedString) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
				
			}
			
		}
		
		//Set<Entry<Character, Integer>> entry = map.entrySet();
		for (Entry<Character, Integer> entries : map.entrySet()) {
			if(entries.getValue()>1) {
				System.out.println(entries.getKey()+ ":" +entries.getValue());
			}
			
		}
		

	}

}
