/**
 * 
 */
package com.ss.training.weekone;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author derrianharris
 *
 */
public class LambdasTest {

	@Test
	public void isOddTest() {
		Lambdas l = new Lambdas();

		assertTrue(l.isOdd().check(1));
		assertFalse(l.isOdd().check(2));
	}

	@Test
	public void isPrimeTest() {
		Lambdas l = new Lambdas();
		
		assertTrue(l.isPrime().check(7));
		assertFalse(l.isPrime().check(4));
		assertFalse(l.isPrime().check(1));
		assertFalse(l.isPrime().check(0));
	}

	@Test
	public void isPalindromeTest() {
		Lambdas l = new Lambdas();

		assertTrue(l.isPalindrome().check(838));
		assertFalse(l.isPalindrome().check(17));
	}

	@Test
	public void parseInputFileTest() {
		Lambdas l = new Lambdas();

		assertArrayEquals(null,l.parseInputFile("fakeFile.txt"));
		assertNotEquals(null,Arrays.asList(l.parseInputFile("resources/TestCases.txt")));
	}

}
