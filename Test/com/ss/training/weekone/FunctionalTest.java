/**
 * 
 */
package com.ss.training.weekone;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * Test Class for Function class
 * @author derrianharris
 *
 */
public class FunctionalTest {
	
	@Test
	public void rightDigitTest(){
		Functional func = new Functional();
		
		assertEquals(Arrays.asList(1,0,5,6),func.rightDigit(Arrays.asList(1,10,15,256)));
		assertEquals(Arrays.asList(),func.rightDigit(Arrays.asList()));
		assertEquals(Arrays.asList(),func.rightDigit(null));
		assertNotEquals(Arrays.asList(),func.rightDigit(Arrays.asList(1,10,15,256)));
		
	}
	
	@Test
	public void doublingTest(){
		Functional func = new Functional();
		
		assertEquals(Arrays.asList(2,20,30,512),func.doubling(Arrays.asList(1,10,15,256)));
		assertEquals(Arrays.asList(),func.doubling(Arrays.asList()));
		assertEquals(Arrays.asList(),func.rightDigit(null));
		assertNotEquals(Arrays.asList(),func.doubling(Arrays.asList(1,10,15,256)));
	}
	
	@Test
	public void noXTest(){
		Functional func = new Functional();
		
		assertEquals(Arrays.asList("a","b","c"),func.noX(Arrays.asList("axx","xbx","xxc")));
		assertEquals(Arrays.asList(),func.noX(Arrays.asList()));
		assertEquals(Arrays.asList(),func.rightDigit(null));
		assertNotEquals(Arrays.asList(),func.noX(Arrays.asList("axx","xbx","xxc")));
	}
}
