package stringConcepts;

public class StringBufferConcepts {

	public static void main(String[] args) {
		StringBuilder obj1 = new StringBuilder("Hello");
		String str = obj1.toString();
		StringBuffer obj = new StringBuffer(str);
		
		System.out.println(obj);

	}

}
