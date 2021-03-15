/**
 * 
 */
package com.ss.training.weekone;

import static org.junit.Assert.*;

import org.junit.Test;

/**
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
	}

}
