/**
 * 
 */
package com.ss.training.weekone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
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
	
	public List<Integer> rightDigit(List<Integer> intList){
		return intList.stream().map(i-> i % 10).collect(Collectors.toList());
	}
	
	public List<Integer> doubling(List<Integer> intList){
		return intList.stream().map(i-> i * 2).collect(Collectors.toList());
	}
	
	public List<String> noX(List<String> stringList){
		return stringList.stream().map(i-> i.replaceAll("x", "")).collect(Collectors.toList());
	}
}
