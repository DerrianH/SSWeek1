/**
 * 
 */
package com.ss.training.daytwo;

/**
 * Adds sums n numbers from the command line
 * @author derrianharris
 *
 */
public class CommandLineAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double sum = 0.0;
		for (int i = 0; i < args.length; i++) {
			try {
				Double num = Double.parseDouble(args[i]);	
				sum += num;
				
			} catch (Exception e) {
				System.out.println("Invalid Input: " + args[i]);
			}
		}
		System.out.println("Sum: " + sum);
	}

}
