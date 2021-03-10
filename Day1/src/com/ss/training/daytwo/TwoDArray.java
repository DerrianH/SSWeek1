/**
 * 
 */
package com.ss.training.daytwo;

/**
 * Finds the Max value in a 2d Array
 * @author derrianharris
 *
 */
public class TwoDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[][] a = new Double[][] { { 10.0, 0.0, 25.0, -1.0 }, { 700.6, -6.3, 2.0, 5.2 }, { -5.4, 6.9, 2.2, 105.0 } };
		Double max = Double.MIN_VALUE;
		int posX = 0;
		int posY = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
					posX = i;
					posY = j;
				}
			}
		}
		
		System.out.println("Max: " + max + " Position: [" + posX + ", " + posY + "]");
	}
	
}
