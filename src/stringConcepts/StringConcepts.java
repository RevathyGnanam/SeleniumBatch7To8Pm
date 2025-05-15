package stringConcepts;

public class StringConcepts {

	public static void main(String[] args) {
		//						0123456		
		String s1 = new String("Welcome"); 
		s1 = "Welcome to java";
		System.out.println(s1);

		//index of
		System.out.println(s1.indexOf("e"));

		//to get each char
		System.out.println(s1.charAt(3));

		//to get lowercase
		System.out.println(s1.toLowerCase());

		//to get method uppercase
		s1 = s1.toUpperCase();
		System.out.println(s1);

		//to concat
		s1 = s1.concat(" class");
		System.out.println(s1);

		//compare to method
		/*
		 * 0--> String content are equal
		 * +ve
		 * -ve
		 */
		//Ascii a-->97 A--> 65 z--> 122 Z--> 90
		String s2 ="zello";
		String s3="hello";
		System.out.println("compare to" +s2.compareTo(s3));
		
		String s4 = "Revathy    ";
		System.out.println(s4.length());
		System.out.println(s4.trim().length());
		
		//replace with char
		System.out.println(s4.replace('R', '@'));
		
		//substring
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 3));
		
		//contains
		String s5 = "hello";
		System.out.println(s5.contains("ell"));
		
		//equal
		String s6 ="hello";
		//		   01234
		String s7="HELLO";
		System.out.println(s6.equals(s7));
		
		//equalignore
		System.out.println(s6.equalsIgnoreCase(s7));
		
		//lastindexof
		System.out.println(s7.lastIndexOf('L'));
		
		//Splitting the values
		String s8 = "Welcome-to-array-class";
		String [] str =s8.split("-");
		for (String newstr : str) {
			System.out.println(newstr);	
			
		}
		
		//How to make a string to charArray
		String s9 = "Welcome";
		char[] ch =s9.toCharArray();
		for (char c : ch) {
			System.out.println(c);
			
		}
		
		System.out.println(String.valueOf(ch));
		
		
		
		
		
		
		

	}

}
