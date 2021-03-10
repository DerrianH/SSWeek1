/**
 * 
 */
package com.ss.training.daytwo;

/**
 * Rectangle implementation
 * @author derrianharris
 *
 */
public class Rect implements Shape {
	Double length;
	Double width;
	
	public Rect() {
		this.length = 0.0;
		this.width = 0.0;
	}
	
	public Rect(Double length, Double width) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 *	Calculates and returns the are of the shape
	 */
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	/**
	 * Prints Area
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Area: " + calculateArea());
	}

}
