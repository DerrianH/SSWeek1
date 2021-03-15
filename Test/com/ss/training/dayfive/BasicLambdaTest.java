/**
 * 
 */
package com.ss.training.dayfive;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * JUnit Test class for BasicLambda class
 * @author derrianharris
 *
 */
public class BasicLambdaTest {
	
	@Test
	public void sortByLengthAscTest() {
		BasicLambda bl = new BasicLambda();
		String[] stringArrOne = { "This", "is", "a", "string", "array"};
		String[] stringArrTwo = { "a","is","This", "array","string"};
		String[] stringArrThree = { "This", "is", "a", "string", "array"};
		bl.sortByLengthAsc(stringArrOne);
		bl.sortByLengthAsc(null);
		assertEquals(Arrays.asList(stringArrTwo),Arrays.asList(stringArrOne));
		assertNotEquals(Arrays.asList(stringArrThree),Arrays.asList(stringArrOne));
		assertEquals(Arrays.asList(stringArrTwo),Arrays.asList(stringArrOne));
	}
	
	@Test
	public void sortByLengthDecTest() {
		BasicLambda bl = new BasicLambda();
		String[] stringArrOne = { "This", "is", "a", "string", "array"};
		String[] stringArrTwo = {"string","array","This","is","a"};
		String[] stringArrThree = { "This", "is", "a", "string", "array"};
		bl.sortByLengthDec(stringArrOne);
		
		assertEquals(Arrays.asList(stringArrTwo),Arrays.asList(stringArrOne));
		assertNotEquals(Arrays.asList(stringArrThree),Arrays.asList(stringArrOne));
	}
	
	@Test
	public void sortByAlphabeticalTest() {
		BasicLambda bl = new BasicLambda();
		String[] stringArrOne = { "This", "is", "a", "string", "array"};
		String[] stringArrTwo = {"a","array","is","string","This"};
		String[] stringArrThree = { "This", "is", "a", "string", "array"};
		bl.sortByAlphabetical(stringArrOne);
		
		assertEquals(Arrays.asList(stringArrTwo),Arrays.asList(stringArrOne));
		assertNotEquals(Arrays.asList(stringArrThree),Arrays.asList(stringArrOne));
	}
	
	@Test
	public void sortByCharTest() {
		BasicLambda bl = new BasicLambda();
		String[] stringArrOne = { "This", "is", "a", "string", "array","extra"};
		String[] stringArrTwo =  { "extra","This", "is", "a", "string", "array"};
		String[] stringArrThree = { "This", "is", "a", "string", "array","extra"};
		bl.sortByChar(stringArrOne);
		
		assertEquals(Arrays.asList(stringArrTwo),Arrays.asList(stringArrOne));
		assertNotEquals(Arrays.asList(stringArrThree),Arrays.asList(stringArrOne));
	}
	
	@Test
	public void sortByCharStaticHelperTest() {
		BasicLambda bl = new BasicLambda();
		String[] stringArrOne = { "This", "is", "a", "string", "array","extra"};
		String[] stringArrTwo =  { "extra","This", "is", "a", "string", "array"};
		String[] stringArrThree = { "This", "is", "a", "string", "array","extra"};
		bl.sortByCharStaticHelper(stringArrOne);
		
		assertEquals(Arrays.asList(stringArrTwo),Arrays.asList(stringArrOne));
		assertNotEquals(Arrays.asList(stringArrThree),Arrays.asList(stringArrOne));
	}
	
	@Test
	public void stringCompTest() {
		BasicLambda bl = new BasicLambda();
		String stringA = "string";
		String stringB = "ee";

		
		
		assertEquals(2,BasicLambda.stringComp(stringA,stringB));
		assertEquals(-2,BasicLambda.stringComp(stringB,stringA));
		assertEquals(0,BasicLambda.stringComp(stringB,stringB));
	}
}
