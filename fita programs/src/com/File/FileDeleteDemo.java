package com.File;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		int a;
		File myfile = new File("C:\\Users\\Sathish\\Desktop\\SATHISHKUMAR\\FILE\\test.txt");
		if (myfile.delete()) {
			System.out.println("File Delete successfully");
		} else {
			System.out.println("file alredy Deleted");

		}
	}
}
