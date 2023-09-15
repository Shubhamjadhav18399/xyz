package com.jspiders.filehandling1.delete;

import java.io.File;

public class FileDelete {
	public static void main(String[] args) {
		File file = new File("WEJE5.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("File Deleted Successfully..!");
		}
		else {
			System.out.println("file Does not exits..!");
		}
	}

}
	