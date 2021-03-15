/**
 * 
 */
package com.ss.training.dayfive;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author derrianharris
 *
 */
public class CommaSeperatedStringTest {
	@Test
	public void evenOrOddTest() {
		CommaSeperatedString csv = new CommaSeperatedString();
		Integer[] arr1= {1,2,3};
		Integer[] arr2 = {1,222,3};

		assertEquals("o1,e2,o3", csv.evenOrOdd(arr1));
		assertNotEquals("o1,o222,o3", csv.evenOrOdd(arr2));
	}
}
