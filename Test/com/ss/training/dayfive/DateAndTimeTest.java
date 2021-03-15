/**
 * 
 */
package com.ss.training.dayfive;

import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * JUnit Test class for DateAndTime class
 * @author derrianharris
 *
 */
public class DateAndTimeTest {

	@Test
	public void getNearestThursdayTest() {
		DateAndTime dt = new DateAndTime();
		LocalDate dateOne = LocalDate.of(2021, 3, 11);
		LocalDate dateTwo = LocalDate.of(2021, 3, 15);

		assertEquals(LocalDate.of(2021, 3, 11), dt.getNearestThursday(dateOne));
		assertEquals(LocalDate.of(2021, 3, 11), dt.getNearestThursday(dateTwo));
	}

	@Test
	public void getLengthOfMonthGivenYearTest() {
		DateAndTime dt = new DateAndTime();
		Integer[] monthLengthOne = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Integer[] monthLengthTwo = { 31, 2, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

		assertArrayEquals(monthLengthOne, dt.getLengthOfMonthGivenYear(1997));
		assertNotEquals(Arrays.asList(monthLengthTwo), dt.getLengthOfMonthGivenYear(Year.now()));
	}

	@Test
	public void getMondayDaysTest() {
		DateAndTime dt = new DateAndTime();
		Integer[] mondaysOne = { 1, 8, 15, 22, 29 };
		Integer[] mondaysTwo = { 0, 1, 2, 3, 4 };

		assertEquals(Arrays.asList(mondaysOne), dt.getMondayDays(3));
		assertNotEquals(Arrays.asList(mondaysTwo), dt.getMondayDays(3));
	}

	@Test
	public void isFridayTheThirteenthTest() {
		DateAndTime dt = new DateAndTime();
		LocalDate dateOne = LocalDate.of(2021,8,13);
		LocalDate dateTwo = LocalDate.of(2021,8,14);;

		assertTrue(dt.isFridayTheThirteenth(dateOne));
		assertFalse(dt.isFridayTheThirteenth(dateTwo));
	}

}
