package com.jspiders.filehandling1.information;

import java.io.File;
import java.io.IOException;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("WEJE5.txt");
		if (file.exists()) {
			System.out.println("File already exits..!");
		}
		else{
			try {
				file.createNewFile();
				System.out.println("File Created Successfully..!");
			} catch (IOException e) {
				System.out.println("File Not Created..!");
			}
		}
		System.out.println("File name is : "+file.getName());
		System.out.println("Path of the file :" +file.getAbsolutePath());
		
		if (file.canWrite()) {
			System.out.println("File can Writable..!");
		}
		else {
			System.out.println("File can Not Writable..!");
		}
		
		if (file.canRead()) {
			System.out.println("File can readable..!");
		}
		else {
			System.out.println("File can not readable..!");
		}
		
		if (file.canExecute()) {
			System.out.println("File can Exutable..!");
			
		}
		else {
			System.out.println("File can not Exutable.!");
		}
	}

}
