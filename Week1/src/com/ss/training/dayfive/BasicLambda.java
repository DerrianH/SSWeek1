/**
 * 
 */
package com.ss.training.dayfive;

import java.util.Arrays;

/**
 * @author derrianharris
 *
 */
public class BasicLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicLambda bl = new BasicLambda();
		String[] stringArr = { "This", "is", "a", "string", "array", "that", "is", "used", "for", "an", "example"};
				

		System.out.println("\nAscending Sort");
		System.out.println("---------------------------");
		bl.sortByLengthAsc(stringArr);
		Arrays.asList(stringArr).stream().forEach(System.out::println);

		System.out.println("\nDescending Sort");
		System.out.println("---------------------------");
		bl.sortByLengthDec(stringArr);
		Arrays.asList(stringArr).stream().forEach(System.out::println);

		System.out.println("\nAlphabetical Sort");
		System.out.println("---------------------------");
		bl.sortByAlphabetical(stringArr);
		Arrays.asList(stringArr).stream().forEach(System.out::println);
		
		System.out.println("\nChar Sort");
		System.out.println("---------------------------");
		bl.sortByChar(stringArr);
		Arrays.asList(stringArr).stream().forEach(System.out::println);
		
		System.out.println("\nChar Sort Static Helper");
		System.out.println("---------------------------");
		bl.sortByCharStaticHelper(stringArr);
		Arrays.asList(stringArr).stream().forEach(System.out::println);

	}

	public void sortByLengthAsc(String[] arr) {
		Arrays.sort(arr, (a, b) -> (a.length() - b.length()));
	}

	public void sortByLengthDec(String[] arr) {
		Arrays.sort(arr, (a, b) -> (b.length() - a.length()));
	}

	public void sortByAlphabetical(String[] arr) {
		Arrays.sort(arr, (a, b) -> (Character.toLowerCase(a.charAt(0)) - Character.toLowerCase(b.charAt(0))));
	}

	public void sortByChar(String[] arr) {
		Arrays.sort(arr, (a, b) -> {	
			return (int)b.chars().filter(chr -> chr == 'e').count() - (int)a.chars().filter(chr -> chr == 'e').count();
		});
	}
	
	public void sortByCharStaticHelper(String[] arr) {
		Arrays.sort(arr, (a, b) -> BasicLambda.stringComp(a, b));
	}
	
	public static int stringComp(String a, String b) {
		return (int)b.chars().filter(chr -> chr == 'e').count() - (int)a.chars().filter(chr -> chr == 'e').count();
	}

}
