package stringConcepts;

public class ReverseEachWord {

	public static void main(String[] args) {
		//				0	1	2	3
		String s = "Welcome to java class";
		String str="";
		String[] arr = s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			str = str+arr[i]+" ";
		}
		
		System.out.println(str);
		

	}

}
