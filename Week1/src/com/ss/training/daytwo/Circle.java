/**
 * 
 */
package com.ss.training.daytwo;

/**
 * Circle implementation
 * @author derrianharris
 *
 */
public class Circle implements Shape {
	
	Double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	public Circle(Double radius) {
		this.radius = radius;
	}
	
	/**
	 *	Calculates and returns the are of the shape
	 */
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
	/**
	 * Prints Area
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Circle Area: " + calculateArea());
	}

}
