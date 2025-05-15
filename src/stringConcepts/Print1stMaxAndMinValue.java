package stringConcepts;

public class Print1stMaxAndMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 7, 2, 8, 1, 6};
		int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is larger
            }
            if (arr[i] < min) {
                min = arr[i];  // Update min if current element is smaller
            }
        }

        System.out.println("1st Maximum Value: " + max);
        System.out.println("1st Minimum Value: " + min);
	}

}
