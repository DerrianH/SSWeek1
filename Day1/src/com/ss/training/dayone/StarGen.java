/**
 * 
 */
package com.ss.training.dayone;

/**
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
		
		
		for(int i = 0; i <= 4; i++) {
			int j = i * 2 + 1;
			System.out.println(genCharString(j,'*'));
		}
		System.out.println(genCharString(11,'-'));
		
		for(int i = 0; i <= 4; i++) {
			System.out.println(genCharString(i,'*'));
		}
		System.out.println(genCharString(9,'-'));
	}
	
	public static String genCharString(int num, char symb) {
		String result = "";
		
		for(int i = 0; i < num; i++) {
			result += symb;
		}
		return result;
	}
}
