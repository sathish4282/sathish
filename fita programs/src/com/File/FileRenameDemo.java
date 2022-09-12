package com.File;

import java.io.File;
import java.io.IOException;

public class FileRenameDemo {

	public static void main(String[] args) throws IOException {
		int a;
		File myfile = new File("C:\\Users\\Sathish\\Desktop\\SATHISHKUMAR\\FILE\\sathish.txt");
			myfile.createNewFile();
		File renamefile = new File("C:\\Users\\Sathish\\Desktop\\SATHISHKUMAR\\FILE\\sathishkumar.txt");
		//renamefile.renameTo("Shyam.txt");
		myfile.renameTo(renamefile);
	    System.out.println(" File Name "+ renamefile);
	    System.out.println(" File Name " + myfile.getName());
	}
}

