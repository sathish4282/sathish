package ArraysProgram;

public class Sorting_Arrays {
// swaping two elements in arrays
	public static void main(String[] args) {
		int[] marksArray = new int[] { 44, 88, 22, 77, 99 };
		int temp;
		for (int i = 0; i < marksArray.length; i++) {
			System.out.println(marksArray[i]);
		}
		
		for (int i = 0; i < marksArray.length; i++) {
			for (int j = i; j < marksArray.length; j++) {
				if (marksArray[i] > marksArray[j]) {
					temp = marksArray[i];
					marksArray[i] = marksArray[j];
					marksArray[j] = temp;

				}
			}
		}
		for (int a : marksArray) {
			System.out.println(a);
		}
	}

}
