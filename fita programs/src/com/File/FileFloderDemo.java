package com.File;

import java.io.File;

public class FileFloderDemo {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\Sathish\\Desktop\\SATHISHKUMAR");
		if (f1.mkdir()) { // folder create method name mkdir() means =make directry
			System.out.println("folder is created successfully");
		}else{
			System.out.println("folder is alredy created");
		}
		//SUBFOLDER CREATION:
		File f2 = new File("C:\\Users\\Sathish\\Desktop\\SATHISHKUMAR\\FILE");
		if(f2.mkdirs()){  //folder create method name mkdir() means =make directry
			System.out.println("subfolder created successfully");
		}else{
			System.out.println("subfolder alredy exists");
		}

	}

}
