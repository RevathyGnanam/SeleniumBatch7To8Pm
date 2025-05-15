package stringConcepts;

public class ReverseString {

	public static void main(String[] args) {
		//         0123456
		String s ="Welcome to Java";
		String str = "";
		for(int i=s.length()-1;i>=0;i--) {
			str = str+s.charAt(i);
		}
		System.out.println(str);
		
//		StringBuffer str = new StringBuffer(s);
//		String reversestring = str.reverse().toString();
//		System.out.println(reversestring);
	}

}
