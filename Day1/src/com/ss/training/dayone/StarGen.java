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
		// TODO Auto-generated method stub
		for(int i = 0; i <= 4; i++) {
			System.out.println(genCharString(i,'*'));
		}
		System.out.println(genCharString(9,'-'));
		
		
		System.out.println(genCharString(10,'-'));
		for(int i = 4; i >= 0; i--) {
			System.out.println(genCharString(i,'*'));
		}
		
		
		for(int i = 0; i < 4; i++) {
			int j = i * 2 + 1;
			System.out.println(genCharStringCentered(11,j,'*'));
		}
		System.out.println(genCharString(11,'-'));
		
		for(int i = 3; i >= 0; i--) {
			int j = i * 2 + 1;
			System.out.println(genCharStringCentered(11,j,'*'));
		}
		System.out.println(genCharString(12,'-'));
		

	}
	
	
	/**
	 * Generates a number of chars in a string
	 * @param num
	 * @param symb
	 * @return
	 */
	public static String genCharString(int num, char symb) {
		String result = "";
		
		for(int i = 0; i < num; i++) {
			result += symb;
		}
		return result;
	}


	/**
	 * Generates a number of chars in a string centered around a middle point
	 * @param lineLength
	 * @param num
	 * @param symb
	 * @return
	 */
	public static String genCharStringCentered(int lineLength,int num, char symb) {
		String result = "";
		int halfNum = (int) Math.ceil((lineLength - num) * 0.5);
		for(int i = 0; i < lineLength; i++) {
			
			if(i >= halfNum && i < lineLength - halfNum ) {
				result += symb;
				continue;
			}
			result += " ";
			
		}
		return result;
	}
}
