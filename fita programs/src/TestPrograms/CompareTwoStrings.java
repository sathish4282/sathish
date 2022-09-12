package TestPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		char[] ch = name1.toCharArray();
		char[] ch1 = name2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		System.out.println(ch);
		System.out.println(ch1);
		boolean condition = Arrays.equals(ch, ch1);
		if (condition) {
			System.out.println("String is Equal");
		} else {
			System.out.println("String is Notequal");
		}
	}

}
