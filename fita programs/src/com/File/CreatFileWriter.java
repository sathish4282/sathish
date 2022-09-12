package com.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatFileWriter {

	public static void main(String[] args)throws Exception {
		 FileWriter f;
		 try { 
			 f = new FileWriter("C:\\File\\ReadFile.txt");
			 f.write("Sathishkumar"); 
			 f.close(); 
		 }catch (IOException e) {  
		  e.printStackTrace(); 
		  }
		 
		
		FileWriter f1 = new FileWriter("C:\\study\\fita\\WriteFile.txt");
		f1.write("Sample Data to  store in text file");
		f1.close();

	}

}
