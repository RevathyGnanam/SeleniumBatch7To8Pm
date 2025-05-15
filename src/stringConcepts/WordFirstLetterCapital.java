package stringConcepts;

public class WordFirstLetterCapital {

	public static void main(String[] args) {
		
		//Output: Samyukatha Is My Baby Girl

		//			0		1	  2  3    4
		String s ="samyukatha is my baby girl";
		
		char[] words = s.toCharArray();
		for(int i =0;i<words.length;i++) {
			words[0] = Character.toUpperCase(words[0]);
			if(words[i]==' ') {
				words[i+1] =Character.toUpperCase(words[i+1]);
			}
			
		}
		String newString =String.valueOf(words);
		System.out.println(newString);
		
		
	}

}
