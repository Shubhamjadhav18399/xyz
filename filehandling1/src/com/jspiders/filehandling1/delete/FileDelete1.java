package com.jspiders.filehandling1.delete;

import java.io.File;

public class FileDelete1 {
	public static void main(String[] args) {
		//delete file Using Default Path
		File file = new File("WEJM5.txt	");
		if (file.exists()) {
			file.delete();
			System.out.println("File Deleted Successfully...!");
		}
		else {
			System.out.println("File Does Not Exist..!");
		}
	}

}
