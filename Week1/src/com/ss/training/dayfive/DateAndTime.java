/**
 * 
 */
package com.ss.training.dayfive;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author derrianharris
 *
 */
public class DateAndTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateAndTime dt = new DateAndTime();
		
		
		/*
		 * 1. Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
		 * 	LocalDateTime
		 */
		LocalDateTime birthday = LocalDateTime.of(1997,Month.FEBRUARY, 1, 23, 27, 0, 0);
		System.out.println("Birthday: " + birthday.format(DateTimeFormatter.ISO_DATE_TIME));
		
		Random rand = new Random();
		
		/*
		 * 2. Given a random date, how would you find the date of the previous Thursday?
		 */
		System.out.println("Nearest Thursday: " + dt.getNearestThursday(birthday.toLocalDate()).format(DateTimeFormatter.ISO_DATE));
		
		/*
		 * 3. What is the difference between a ZoneId and a ZoneOffset?
		 * 	ZoneId is the id for the time zone ie America/Chicago. ZoneOffset is the offest from UTC 0:00 ie America/Chicago -5:00
		 */
		
		/*
		 * 4. How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?
		 */
		ZonedDateTime zonedTime = ZonedDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
		System.out.println("Zoned Time from Instant: " + zonedTime);
		
		System.out.println("Instant from zonedTime: " + zonedTime.toInstant());
		
		
		/*
		 * 5. Write an example that, for a given year, reports the length of each month within that year.
		 */
		Integer[] monthsLengths = dt.getLengthOfMonthGivenYear(1997);
		for(int i = 0; i < 12; i++) {
			System.out.println(Month.of(i+1).name() + " - " + monthsLengths[i]);
		}
		/*
		 * 6. Write an example that, for a given month of the current year, lists all of the Mondays in that month.
		 */
		Month month = LocalDate.now().getMonth();
		System.out.println("Mondays in " + month.name() + " this year");
		dt.getMondayDays(month).stream().forEach(System.out::println);
		
		/*
		 * 4. 7. Write an example that tests whether a given date occurs on Friday the 13th.
		 */
		LocalDate date = LocalDate.now();
		System.out.println("Is " + date.format(DateTimeFormatter.ISO_DATE) + " Friday the 13th? " + dt.isFridayTheThirteenth(date));
		date = LocalDate.of(2021,8,13);
		System.out.println("Is " + date.format(DateTimeFormatter.ISO_DATE) + " Friday the 13th? " + dt.isFridayTheThirteenth(date));
		
		
	}
	
	
	public LocalDate getNearestThursday(LocalDate date) {
		while(date.getDayOfWeek() != DayOfWeek.THURSDAY) {
			date = date.minusDays(1);
		}
		return date;
	}
	
	
	
	public Integer[] getLengthOfMonthGivenYear(Year year) {
		Integer[] monthsLength = new Integer[12];
		Arrays.stream(Month.values()).forEach(i->monthsLength[i.getValue()-1] = year.atMonth(i).lengthOfMonth());;
		return monthsLength;
	}
	
	public Integer[] getLengthOfMonthGivenYear(int year) {
		return getLengthOfMonthGivenYear(Year.of(year));
	}
	
	public List<Integer> getMondayDays(Month month) {
		List<Integer> mondays = new ArrayList<Integer>();
		LocalDate date = Year.now().atMonth(month).atDay(1);
		
		while(date.getMonth() == month) {
			if(date.getDayOfWeek() ==  DayOfWeek.MONDAY) {
				mondays.add(date.getDayOfMonth());
			}
			date = date.plusDays(1);
		}
		
		return mondays;
	}
	
	public List<Integer> getMondayDays(int month) {
		return getMondayDays(Month.of(month));
	}
	
	public boolean isFridayTheThirteenth(LocalDate date) {
		return date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
	}
}
