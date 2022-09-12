package ArraysProgram;

public class JaggedArray {

	public static void main(String[] args) {
		// declaring a 2D array with odd columns
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		// initializing a jagged Array
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;
		// printing the data of a jageed Array
		for (int i1 = 0; i1 < arr.length; i1++) {
			for (int j1 = 0; j1 < arr[i1].length; j1++) {
				System.out.print(arr[i1][j1] + "");
			}
			System.out.println(); // new line
		}
	}

}
