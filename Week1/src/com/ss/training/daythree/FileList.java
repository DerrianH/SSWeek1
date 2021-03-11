/**
 * 
 */
package com.ss.training.daythree;

import java.io.File;
import java.nio.file.Paths;

/**
 * Prints all files/directories/sub-directories in a given path
 * 
 * @author derrianharris
 *
 */
public class FileList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileList fl = new FileList();
		String dirPath = Paths.get("").toAbsolutePath().toString();

		File dir = new File(dirPath);
		fl.printDirectory(dir);
	}

	/**
	 * Prints all files/directories/sub-directories in a File
	 * 
	 * @param dir
	 */
	public void printDirectory(File dir) {
		try {
			File[] files = dir.listFiles();

			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("Directory: " + file.getAbsolutePath());
					printDirectory(file);
				} else {
					System.out.println("File: " + file.getAbsolutePath());
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
