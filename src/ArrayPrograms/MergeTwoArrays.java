package ArrayPrograms;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30};
		int[] b= {40,50,60};
		int[] c =new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]= a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i] =b[i];
			
		}
		for (int i : c) {
			System.out.println("After merging the array "+i);
		}
		

	}

}
