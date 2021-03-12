package com.ss.training.dayfour;

/**
 * Thread used to test deadlocking
 * 
 * @author derrianharris
 */
public class DeadlockThreadA implements Runnable {
	Deadlock dl;
	String name;

	public DeadlockThreadA(Deadlock dl, String name) {
		this.dl = dl;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (dl.a != null) {
			synchronized (dl.a) {
				System.out.println(name + " locking a.");
				if (dl.b != null) {
					synchronized (dl.b) {
						System.out.println(name + " locking b.");
						System.out.println(name + " is not deadlocked.");
					}
				}
			}
		}
	}

}