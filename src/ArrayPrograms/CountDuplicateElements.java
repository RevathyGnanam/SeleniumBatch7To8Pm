package ArrayPrograms;

public class CountDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,4,5,6,7,3,5,6,7,9,2,3,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Elements: "+arr[i]);
				}
			}
		}

	}

}
