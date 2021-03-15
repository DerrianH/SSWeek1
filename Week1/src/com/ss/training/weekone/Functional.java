/**
 * 
 */
package com.ss.training.weekone;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that performs functions on List
 * @author derrianharris
 *
 */
public class Functional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Functional func = new Functional();
		List<Integer> intList = Arrays.asList(50,12,13,15,283,343,213);
		List<String> stringList = Arrays.asList("ax", "bb", "cx");
		
		
		System.out.println("Right Digits");
		func.rightDigit(intList).forEach(System.out::println);
		
		System.out.println("Doubling");
		func.doubling(intList).forEach(System.out::println);
		
		System.out.println("No X");
		func.noX(stringList).forEach(System.out::println);
	}
	
	/**
	 * Returns the right most digit on a given list.
	 * @param intList
	 * @return
	 */
	public List<Integer> rightDigit(List<Integer> intList){
		if(intList == null) {
			return new ArrayList<Integer>();
		}
		return intList.stream().map(i-> i % 10).collect(Collectors.toList());
	}
	
	/**
	 * Returns the given list with every value doubled.
	 * @param intList
	 * @return
	 */
	public List<Integer> doubling(List<Integer> intList){
		if(intList == null) {
			return new ArrayList<Integer>();
		}
		return intList.stream().map(i-> i * 2).collect(Collectors.toList());
	}
	
	/**
	 * Returns the given list with the x character removed.
	 * @param stringList
	 * @return
	 */
	public List<String> noX(List<String> stringList){
		if(stringList == null) {
			return new ArrayList<String>();
		}
		return stringList.stream().map(i-> i.replaceAll("x", "")).collect(Collectors.toList());
	}
}
