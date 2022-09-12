package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			String s1 = "sathish";
			System.out.println(s1.charAt(7));
		} catch (Exception e) {
			String s2 = "sathish";
			System.out.println(s2.charAt(6));
			System.out.println("hello");
		}
		try {
			int[] array1 = { 1, 2, 3, 4, 5 };
			System.out.println(array1[5]);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			int[] array2 = { 1, 2, 3, 4, 5 };
			for (int i = 0; i < array2.length; i++) {
				System.out.print(array2[i]);
			}
		} finally {
			System.out.println("Done");
		}
	}
}
