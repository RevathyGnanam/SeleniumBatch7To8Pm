package stringConcepts;

public class PrintSpecialChar {

	public static void main(String[] args) {
		String s ="T_Om# 0R% hjhj&^@#";
		String CharString="";
		for(int i=0;i<s.length();i++) {
			if(!(Character.isLowerCase(s.charAt(i))||Character.isUpperCase(s.charAt(i))||Character.isDigit(s.charAt(i)))) {
				CharString =CharString+s.charAt(i);
			}
			
		}
		System.out.println(CharString.trim());
		

	}

}
