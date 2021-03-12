/**
 * 
 */
package com.ss.training.dayfour;

/**
 * Implementation of double checked locking
 * 
 * @author derrianharris
 *
 */
public class DoubleCheckedLock {
	private DoubleCheckedLock() {

	}

	private static DoubleCheckedLock instance = null;

	public static DoubleCheckedLock getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new DoubleCheckedLock();
				}
			}
		}

		return instance;
	}
}
