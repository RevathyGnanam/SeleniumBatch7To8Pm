package ArrayPrograms;

public class CalculateAverageValueOfArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,6,7,8,9};
		int sum =0;
		int avgValue=0;
		for(int i=0;i<a.length;i++) {
			sum =sum+a[i];
		}
		avgValue = sum/a.length;
		System.out.println("Average Value: "+avgValue);
	}

}
