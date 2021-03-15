/**
 * 
 */
package com.ss.training.dayfive;

import java.util.Arrays;

/**
 * @author derrianharris
 *
 */
public class StringList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringList sl = new StringList();
		String[] stringArr = {"This","is","a","string","array","cat","dog","app"};
		String[] filteredArr = sl.filterStringArr(stringArr, "a", 3);
		
		Arrays.asList(filteredArr).stream().forEach(System.out::println);
	}
	
	public String[] filterStringArr(String[] arr, String c, int length) {
		return Arrays.stream(arr).filter(i -> i.contains(c)).filter(i -> i.length() == length).toArray(String[]::new);
	}

}
