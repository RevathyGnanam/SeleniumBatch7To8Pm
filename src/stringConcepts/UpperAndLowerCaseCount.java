package stringConcepts;

import java.util.Iterator;

public class UpperAndLowerCaseCount {

	public static void main(String[] args) {

		// Output: Upper Case count 7
		//Lower Case count 11
		String str = "Welcome to Java CLASS";
		String upperCount = "";
		String LowerCount="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		if(Character.isUpperCase(ch)) {
			upperCount =upperCount+Character.charCount(ch);
		}
			if(Character.isLowerCase(ch)) {
				LowerCount = LowerCount+Character.charCount(ch);
			}
		}

		System.out.println("Upper Case count "+upperCount.length());
		System.out.println("Lower Case count "+LowerCount.length());
		System.out.println("Upper Case  "+upperCount);
		System.out.println("Lower Case  "+LowerCount);

	}

}
