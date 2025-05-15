package javaConcepts;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
	String[] names = {"Revathy","prithvi","Tamil"};
		
		
	System.out.println(names.length); 
	for (String newName : names) {
		System.out.println(newName);
	
	}
	
		//Another method
		int[] a = new int[4];
		a[0] = 100;
		a[1] = 200;
		a[2]=200;
		a[3]=400;
		System.out.println(Arrays.toString(a));
	

	}

}
