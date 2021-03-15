/**
 * 
 */
package com.ss.training.weekone;

import java.util.Arrays;
import java.util.List;

/**
 * @author derrianharris
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Recursion recur = new Recursion();
		
		Integer[] intList = {1, 2, 4, 8, 1};
		
		System.out.println(recur.groupSumClump(0, intList, 14));
	}
	
	
	public boolean groupSumClump(Integer start, List<Integer> intList, Integer target) {
		
		/*
		 * Check if we've reached the end of the list.
		 * If we have check to see if we have the target.
		 */
		if(start >= intList.size())
	        return target == 0;
		
		int i = start;
	    int sum = 0;
	    
	    
	    /*
		 * Sum all of the identical && adjacent numbers
		 */
	    while(i < intList.size() && intList.get(start) == intList.get(i)) {
	    	sum += intList.get(i);
	        i++;
	    }
	    
	    /*
		 * Subtract the sum from the target and call groupSumClump with new start and new target.
		 */
	    if(groupSumClump(i, intList, target - sum))
	        return true;
	                                        
	    /*
		 * Call groupSumClump with new start.
		 */
		return groupSumClump(i, intList, target);
	}
	
	public boolean groupSumClump(Integer start, Integer[] intList, Integer target) {
		return groupSumClump(start,Arrays.asList(intList),target);
	}
}
