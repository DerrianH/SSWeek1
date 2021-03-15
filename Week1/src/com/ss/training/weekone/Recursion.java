/**
 * 
 */
package com.ss.training.weekone;

import java.util.Arrays;
import java.util.List;

/*
 *  Given an array of ints, is it possible to choose a group of some of the ints, 
 *  such that the group sums to the given target, with this additional constraint: 
 *  if there are numbers in the array that are adjacent and the identical value, 
 *  they must either all be chosen, or none of them chosen. For example, with the 
 *  array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or 
 *  not, all as a group. (one loop can be used to find the extent of the identical values).
 *  
 *  @author derrianharris
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Recursion recur = new Recursion();

		Integer[] intList = { 1, 2, 4, 8, 1 };

		System.out.println(recur.groupSumClump(0, intList, 14));
	}

	/**
	 * Given an array of ints, return a group of some of the ints,
	 * such that the group sums to the given target with this additional constraint: 
	 *  if there are numbers in the array that are adjacent and the identical value, 
	 *  they must either all be chosen, or none of them chosen.
	 * 
	 * @param start
	 * @param intList
	 * @param target
	 * @return
	 */
	public boolean groupSumClump(Integer start, List<Integer> intList, Integer target) {

		
		if(intList == null) {
			return false;
		}
		
		/*
		 * Check if we've reached the end of the list. If we have check to see if we
		 * have the target.
		 */
		if (start >= intList.size())
			return target == 0;

		int i = start;
		int sum = 0;

		/*
		 * Sum all of the identical && adjacent numbers
		 */
		while (i < intList.size() && intList.get(start) == intList.get(i)) {
			sum += intList.get(i);
			i++;
		}

		/*
		 * Subtract the sum from the target and call groupSumClump with new start and
		 * new target.
		 */
		if (groupSumClump(i, intList, target - sum))
			return true;

		/*
		 * Call groupSumClump with new start.
		 */
		return groupSumClump(i, intList, target);
	}
	
	/**
	 * Given an array of ints, return a group of some of the ints,
	 * such that the group sums to the given target with this additional constraint: 
	 *  if there are numbers in the array that are adjacent and the identical value, 
	 *  they must either all be chosen, or none of them chosen.
	 * 
	 * @param start
	 * @param intList
	 * @param target
	 * @return
	 */
	public boolean groupSumClump(Integer start, Integer[] intList, Integer target) {
		return groupSumClump(start, Arrays.asList(intList), target);
	}
}
