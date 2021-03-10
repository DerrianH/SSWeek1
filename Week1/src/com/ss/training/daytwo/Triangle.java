/**
 * 
 */
package com.ss.training.daytwo;

/**
 * Triangle implementation
 * @author derrianharris
 *
 */
public class Triangle implements Shape {
	
	Double height;
	Double base;
	
	public Triangle() {
		this.height = 0.0;
		this.base = 0.0;
	}
	public Triangle(Double height, Double base) {
		this.height = height;
		this.base = base;
	}
	
	/**
	 *	Calculates and returns the are of the shape
	 */
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * height * base;
	}
	
	/**
	 * Prints Area
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Triangle Area: " + calculateArea());
	}

}
