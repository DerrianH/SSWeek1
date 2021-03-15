/**
 * 
 */
package com.ss.training.dayfive;

import java.util.Arrays;

/**
 * Class to Integer array into csv
 * @author derrianharris
 *
 */
public class CommaSeperatedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommaSeperatedString cs = new CommaSeperatedString();
		Integer[] nums = { 1, 2, 33, 4, 452, 26, 7, 8, 9, 10, 11, 12, 13, 14 };
		String evenOrOddArr = cs.evenOrOdd(nums);

		System.out.println(evenOrOddArr);

	}

	/**
	 * Return given array in csv format with 'e' or 'o' appended 
	 * to the beginning of each number depending on if it is even or odd
	 * @param arr
	 * @return
	 */
	public String evenOrOdd(Integer[] arr) {
		if(arr == null) {
			return "";
		}
		
		
		return String.join(",", Arrays.stream(arr).map(i -> {
			if (i % 2 == 0) {
				return "e" + i;
			} else {
				return "o" + i;
			}
		}).toArray(String[]::new));
	}
}
