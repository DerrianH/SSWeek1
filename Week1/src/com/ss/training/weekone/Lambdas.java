/**
 * 
 */
package com.ss.training.weekone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class to parse a file and run its functions
 * @author derrianharris
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lambdas lambdas = new Lambdas();
		String txtPath = "resources/TestCases.txt";
		if(args != null && args.length > 0) {
			txtPath = args[0];
		}
		Integer[][] testCases = lambdas.parseInputFile(txtPath);
		if (testCases != null) {
			Arrays.stream(testCases).forEach(n -> {
				switch (n[0]) {
				case 1:
					System.out.println(n[1] + " - " + (lambdas.isOdd().check(n[1]) ? "ODD" : "EVEN"));
					break;
				case 2:
					System.out.println(n[1] + " - " + (lambdas.isPrime().check(n[1]) ? "PRIME" : "COMPOSITE"));
					break;
				case 3:
					System.out
							.println(n[1] + " - " + (lambdas.isPalindrome().check(n[1]) ? "PALINDROME" : "NOT PALINDROME"));
					break;
				default:
					System.out.println("Invalid Test Case Found: " + n[0]);
					break;
				}
			});
		}
	}

	/**
	 * Returns true if the given number is odd
	 * @return
	 */
	public PerformOperation isOdd() {
		return n -> n % 2 != 0;
	}

	/**
	 * Returns true if the given number is prime
	 * @return
	 */
	public PerformOperation isPrime() {
		return n -> {

			if (n == 0 || n == 1) {
				return false;
			}
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

	/**
	 * Returns true if the given number is a palindrome
	 * @return
	 */
	public PerformOperation isPalindrome() {
		return n -> n.toString().equals(new StringBuilder(n.toString()).reverse().toString());
	}

	/**
	 * Returns Array of Arrays of parsed file
	 * @return
	 */
	public Integer[][] parseInputFile(String filePath) {
		File file = new File(filePath);
		try (Scanner txtScanner = new Scanner(file);) {
			Integer numCases = txtScanner.nextInt();

			Integer[][] testCases = new Integer[numCases][];

			for (int i = 0; i < numCases; i++) {
				testCases[i] = new Integer[2];
				testCases[i][0] = txtScanner.nextInt();
				testCases[i][1] = txtScanner.nextInt();
			}
			return testCases;
		} catch (FileNotFoundException e) {
			System.out.println("No file found at: " + file.getAbsolutePath());
		}
		catch (InputMismatchException e) {
			System.out.println("Input is invalid");
		}
		return null;
	}
}
