package ArrayPrograms;

public class SortingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,90,40,50};
		int temp =0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp =a[j]; 
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
			System.out.println("Ascending order:"+a[i]);
			//System.out.println("Descending order:"+a[i]);
		}
System.out.println(a[0]); //1st minimum value
System.out.println(a[1]); //2nd minimum vale
System.out.println(a[a.length-1]); //1st maximum value
System.out.println(a[a.length-2]); //2nd maximum value
	}

}
