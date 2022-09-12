package ArraysProgram;

public class Max_Min_ValuesCheck {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 50, 5 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}
}