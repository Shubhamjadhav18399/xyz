package com.jspiders.filehandling1.create;

import java.io.File;
import java.io.IOException;

public class FileCreate3 {
	public static void main(String[] args) {
		//Using Absolute Path
		File file = new File("C:\\Apps\\WEJE3\\Qspiders\\WEJE5.txt");
		try {
			file.createNewFile();
			System.out.println("File Created Successful...!");
		} catch (IOException e) {
			System.out.println("File Note Created...!");
		}
		
		
	}

}
