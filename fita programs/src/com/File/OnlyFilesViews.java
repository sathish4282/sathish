package com.File;

import java.io.File;

public class OnlyFilesViews {

	public static void main(String[] args) {
		File myfile = new File("C:\\Users\\Sathish\\Desktop");
		File[] onlyfilesview = myfile.listFiles();
		for (File s : onlyfilesview)
			if (s.isFile())
				System.out.println(s);

	}

}
