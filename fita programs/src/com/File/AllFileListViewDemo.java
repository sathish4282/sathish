package com.File;

import java.io.*;

public class AllFileListViewDemo {

	public static void main(String[] args) {
		File myfile = new File("C:\\Users\\Sathish\\Desktop");
		String[] listoffiles = myfile.list();
//		 for(int i=0;i<listoffiles.length;i++){
		// System.out.println(listoffiles[i]);
		// }
		for (String s : listoffiles) {
			System.out.println(s);
	}
	}

}
