package ArrayPrograms;

public class PrintFirstMaxAndMinValue {

	public static void main(String[] args) {

		int[] arr = {3,3,4,6,7,8,9,6,5};
		int max = arr[0];
		int min =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min =arr[i];
			}
			
		}
		System.out.println("1st Maximum value: "+max);
		System.out.println("1st Minimum value: "+min);



	}

}
