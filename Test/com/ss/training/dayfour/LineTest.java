package com.ss.training.dayfour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * JUnit Test Class for Line class
 * 
 * @author derrianharris
 *
 */
public class LineTest {

	@Test(expected = ArithmeticException.class)
	public void getSlopeTest() {
		Line a = new Line(0, 0, 1, 1);
		assertEquals(1, a.getSlope(), .0001);
		assertNotEquals(4, a.getSlope(), .0001);

		a = new Line(1, 1, 1, 1);
		a.getSlope();
	}

	@Test
	public void getDistanceTest() {
		Line a = new Line(0, 0, 0, 1);
		assertEquals(1, a.getDistance(), .0001);
		assertNotEquals(4, a.getDistance(), .0001);
	}

	@Test
	public void parallelToTest() {
		Line a = new Line(0, 0, 1, 0);
		Line b = new Line(0, 1, 1, 1);

		Line c = new Line(0, 2, 1, 1);
		assertTrue(a.parallelTo(b));
		assertFalse(a.parallelTo(c));
	}

}
