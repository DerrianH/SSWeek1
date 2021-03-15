/**
 * 
 */
package com.ss.training.weekone;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * Test Class for Recursion class
 * @author derrianharris
 *
 */
public class RecursionTest {

	@Test
	public void groupSumClumpTest() {
		Recursion recur = new Recursion();
		
		assertTrue(recur.groupSumClump(0, new Integer[] {2, 4, 8}, 10));
		assertFalse(recur.groupSumClump(0, new Integer[] {2, 4,4, 8}, 14));
		assertFalse(recur.groupSumClump(0, new Integer[] {}, 14));
		
		List<Integer> testList = null;
		assertFalse(recur.groupSumClump(0, testList, 14));
	}

}
