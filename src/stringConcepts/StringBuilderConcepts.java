package stringConcepts;

public class StringBuilderConcepts {



	public static void main(String[] args) {
		String s="DAD";
		String reverseString="";
		for (int i = s.length()-1; i >=0; i--) {
			reverseString= reverseString+s.charAt(i);
			
		}
		System.out.println(reverseString);
		if(reverseString.equalsIgnoreCase(s)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}

	}



}
