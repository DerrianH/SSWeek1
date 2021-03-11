/**
 * 
 */
package com.ss.training.daythree;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Appends text to a file.
 * 
 * @author derrianharris
 *
 */
public class AppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to add to file:");
		AppendText at = new AppendText();
		StringBuilder text = new StringBuilder();
		text.append(sc.nextLine());

		// String text = "Text to append.";
		Path p = Paths.get("AppendText.txt");
		at.appendText(p, text.toString());
		System.out.println("Done!");
		sc.close();
	}

	/**
	 * Appends text to a file.
	 * 
	 * @param p
	 * @param text
	 */
	public void appendText(Path p, String text) {
		try {
			Files.write(p, text.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
