package TestPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		int i, n;
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char str[] = s.toCharArray();
		n = str.length;
		System.out.println("Reversed String is: ");
		for (i = n - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}

	}

}
