package ArraysProgram;

public class PrintArray {

	public static void main(String[] args) {
		// initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Elements of given array:");
		// Loop through the array incrementing value of i
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}

	}

}
