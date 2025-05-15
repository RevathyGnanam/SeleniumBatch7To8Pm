package stringConcepts;

public class PalindromeString {

	public static void main(String[] args) {
		//Input: DAD Output: DAD
		
		String originalstr ="DasdD";
		String palindromeStr = "";
		for(int i = originalstr.length()-1;i>=0;i--) {
			palindromeStr =palindromeStr+originalstr.charAt(i);
		}
		System.out.println("Reverse String "+palindromeStr);
		
		if(palindromeStr.equalsIgnoreCase(originalstr)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}

	}

}
