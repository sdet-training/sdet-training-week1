package week1.day2;

import java.io.File;

public class D2_001f_DirectoryListing {
	public static void main(String[] args) {
		String dirPath = "C:\\SeleniumJAVATraining\\testdata";
		File basedir = new File(dirPath);
		if (basedir != null && basedir.exists()) {
			File[] files = basedir.listFiles();
			System.out.println("Files in the direcotory: " + basedir.getAbsolutePath());
			System.out.println("Is directory readable: " + basedir.canRead());
			System.out.println("Number of files or directories: " + files.length);
			File file;
			for (int count = 0; count < files.length; count++) {
				file = files[count];
				if (file.isDirectory()) {
					System.out.println("Directory: " + file.getName());
				} else {
					System.out.println("File: " + file.getName());
				}

			}
		} else {
			System.out.println("Please provide a valid directory path");
		}

	}
}
