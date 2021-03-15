/**
 * 
 */
package com.ss.training.dayfive;

import java.util.Arrays;

/**
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

	public String evenOrOdd(Integer[] arr) {
		return String.join(",", Arrays.stream(arr).map(i -> {
			if (i % 2 == 0) {
				return "e" + i;
			} else {
				return "o" + i;
			}
		}).toArray(String[]::new));
	}
}
