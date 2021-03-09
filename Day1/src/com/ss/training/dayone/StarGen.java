/**
 * 
 */
package com.ss.training.dayone;

/**
 * Prints a triangle with *
 * @author derrianharris
 *
 */
public class StarGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n1) ");
		for(int i = 1; i <= 4; i++) {
			System.out.println(genCharString(i,0,0,'*'));
		}
		System.out.println(genCharString(6,0,0,'.'));
		
		System.out.println("\n2) ");
		int length = 4;
		for(int i = 1; i <= 4; i++) {
			int spacesBefore = length - i;
			System.out.println(genCharString(i,spacesBefore,0,'*'));
		}
		System.out.println(genCharString(6,0,0,'.'));
		
		System.out.println("\n3) ");
		for(int i = 4; i > 0; i--) {
			System.out.println(genCharString(i,0,0,'*'));
		}
		System.out.println(genCharString(6,0,0,'.'));
		
		
		
		/*
		 *  Prints out the out example on page 19 of the Day One powerpoint
		 *
		System.out.println("\n1) ");
		for(int i = 1; i <= 4; i++) {
			System.out.println(genCharString(i,0,0,'*'));
		}
		System.out.println(genCharString(9,0,0,'.'));
		
		System.out.println("\n2) ");
		System.out.println(genCharString(10,0,0,'.'));
		for(int i = 4; i >= 0; i--) {
			System.out.println(genCharString(i,0,0,'*'));
		}
		
		System.out.println("\n3) ");
		int lineLength = 11;
		for(int i = 0; i < 4; i++) {
			int j = i * 2 + 1;
			int numSpaces = (int) Math.ceil((lineLength - j) * 0.5);
			System.out.println(genCharString(j,numSpaces,numSpaces,'*'));
		}
		System.out.println(genCharString(lineLength,0,0,'.'));
		
		System.out.println("\n4) ");
		for(int i = 3; i >= 0; i--) {
			int j = i * 2 + 1;
			int numSpaces = (int) Math.ceil((lineLength - j) * 0.5);
			System.out.println(genCharString(j,numSpaces,numSpaces,'*'));
		}
		System.out.println(genCharString(12,0,0,'.'));
		*/
	}
	
	
	/**
	 * Generates a number of chars in a string with a certain number of spaces before and after the symbols.
	 * @param num
	 * @param symb
	 * @return
	 */
	public static String genCharString(int numToPrint,int spacesBefore,int spacesAfter, char symb) {
		String result = "";
		int len = numToPrint + spacesBefore + spacesAfter;
		for(int i = 0; i < len; i++) {
			if(i >= spacesBefore && i < len - spacesAfter) {
				result += symb;
			}else {
				result += " ";
			}
		}
		return result;
	}
}
