/**
 * 
 */
package com.ss.training.dayfour;

/**
 * Class used to test deadlocking
 * 
 * @author derrianharris
 *
 */
public class Deadlock {

	public Integer a = 1;
	public Integer b = 2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deadlock dl = new Deadlock();

		// Deadlocked
		Runnable dTA = new DeadlockThreadA(dl, "Deadlock Thread A");
		Runnable dTB = new DeadlockThreadB(dl, "Deadlock Thread B");

		// Not Deadlocked
		// Runnable dTA = new DeadlockThreadA(dl, "Deadlock Thread A");
		// Runnable dTB = new DeadlockThreadA(dl, "Deadlock Thread B");

		Thread threadA = new Thread(dTA);
		Thread threadB = new Thread(dTB);

		threadA.start();
		threadB.start();
	}
}
