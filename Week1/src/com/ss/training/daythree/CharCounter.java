/**
 * 
 */
package com.ss.training.daythree;

import java.io.File;
import java.util.Scanner;

/**
 * Count the number of a given character in a file
 * 
 * @author derrianharris
 *
 */
public class CharCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// String txtPath = "Script.txt";
		String txtPath = "resources/ScriptSmall.txt";

		CharCounter cc = new CharCounter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to look for:");

		String input = sc.next();

		if (input.length() > 1) {
			System.out.println("Invalid input. Only enter one character.");
			sc.close();
			return;
		}
		char c = input.charAt(0);

		try (Scanner txtScanner = new Scanner(new File(txtPath));) {
			StringBuilder txt = new StringBuilder();

			while (txtScanner.hasNextLine()) {
				txt.append(txtScanner.nextLine());
			}
			Integer count = cc.countChar(txt.toString(), c);

			System.out.println("Character: '" + c + "' Found: " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

	/**
	 * Count the number of a given character in a string
	 * 
	 * @param text
	 * @param c
	 * @return
	 */
	public int countChar(String text, char c) {
		Integer count = 0;

		for (char t : text.toCharArray()) {
			if (c == t) {
				count++;
			}
		}

		return count;
	}
}
