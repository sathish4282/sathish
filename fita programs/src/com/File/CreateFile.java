package com.File;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws Exception {
		int a;
		File myfile = new File("C:\\Users\\Sathish\\Desktop\\SATHISHKUMAR\\FILE\\test.txt");
		if (myfile.createNewFile()) {
			System.out.println("File created successfully");
		} else {
			System.out.println("file alredy created");

		}

	}

}
