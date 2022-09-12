package TestPrograms;
import java.util.Scanner;

public class SwappingTwoStrings {
	public static void main(String[] args) {
		String a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		b=sc.nextLine();
		System.out.println("Before swapping:" + a + "" + b);
		a = a + b;
		b = a.substring(0,a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After swapping:" + a + "" + b);

	}

}
