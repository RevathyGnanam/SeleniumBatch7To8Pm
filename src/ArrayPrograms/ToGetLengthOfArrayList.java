package ArrayPrograms;

import java.util.ArrayList;

public class ToGetLengthOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50,60};
		int count =0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
			count++;
		}

		System.out.println(count);
	}

}
