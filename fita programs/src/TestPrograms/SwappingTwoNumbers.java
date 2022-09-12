package TestPrograms;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swapping two number: " + a + " " + b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping two number: " + a + " " + b);
		System.out.println();

	}

}
