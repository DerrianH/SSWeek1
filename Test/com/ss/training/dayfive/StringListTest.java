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
public class StringListTest {

	@Test
	public void filterStringArrTest() {
		StringList sl = new StringList();
		String[] stringArr = { "This", "is", "a", "string", "array", "cat", "dog", "app" };

		assertEquals(Arrays.asList("cat", "app"), Arrays.asList(sl.filterStringArr(stringArr, "a", 3)));
		assertNotEquals(Arrays.asList(stringArr), Arrays.asList(sl.filterStringArr(stringArr, "a", 3)));
	}

}
