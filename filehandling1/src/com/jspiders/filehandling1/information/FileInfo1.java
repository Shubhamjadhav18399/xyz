package com.jspiders.filehandling1.information;

import java.io.File;
import java.io.IOException;

public class FileInfo1 {

	public static void main(String[] args) {
		File file = new File("WEJM5.txt");
		if (file.exists()) {
			System.out.println("File Already exits..!");
		}else {
			try {
				file.createNewFile();
				System.out.println("file created Successfully..!");
			} catch (IOException e) {

                System.out.println("File does not created..!");
				e.printStackTrace();
			}
		}
		
		System.out.println("File Name is :" +file.getName());
		
		System.out.println("Pathof the File is :"+file.getAbsolutePath());
		
		if (file.canRead()){
			System.out.println("file can readable..!");
		}else {
			System.out.println("File can not Readable..!");
		}
		
		if (file.canWrite()) {
			System.out.println("File Can Writeble..!");
		}else {
			System.out.println("File Can not Writeble..!");
		}
		
		if (file.canExecute()) {
			System.out.println("File can exucatable..!");
		}
	}
}
