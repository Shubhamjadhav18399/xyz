package com.jspiders.filehandling1.create;

import java.io.File;
import java.io.IOException;

public class FileCreaate1 {
	public static void main(String[] args) {
		//Using Default Path
		File file = new File("WEJE5.txt");
		try {
			file.createNewFile();
			System.out.println("File Created Successfully...!");
		} catch (IOException e) {
			System.out.println("File Not Created...!");
		}
	
	}

}