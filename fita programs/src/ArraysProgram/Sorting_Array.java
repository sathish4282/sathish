package ArraysProgram;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_Array {
	public void sort_accending_order(){
		String[] str={"Manual Testing", "Automation Testing", "API Testing","security Testing"};
		Arrays.sort(str);         // accending order method name
		System.out.println(Arrays.toString(str));
	}
	public void sort_decending_order(){
		String[] str={"Manual Testing", "Automation Testing", "API Testing","security Testing"};
		Arrays.sort(str,Collections.reverseOrder()); //decending order method name
		System.out.println(Arrays.toString(str));
	}
	public static void main(String[] args) {
		Sorting_Array SA=new Sorting_Array();
		SA.sort_accending_order();
		SA.sort_decending_order();
	}

}
