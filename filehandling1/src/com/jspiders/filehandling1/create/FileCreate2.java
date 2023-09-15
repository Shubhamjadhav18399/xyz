package com.jspiders.filehandling1.create;

import java.io.File;
import java.io.IOException;

public class FileCreate2 {
	public static void main(String[] args) {
		//Using Absolute Path
		File file = new File("C:\\Apps\\WEJE3\\WEJE3.txt");
		
		if (file.exists()) {
			System.out.println("File Already Exits..!");
		}
		else {
		    try {
				file.createNewFile();
				System.out.println("File Created Successfuly..!");
			} catch (IOException e) {
				System.out.println("File Not Created..!");
			}
		}
	}

}
