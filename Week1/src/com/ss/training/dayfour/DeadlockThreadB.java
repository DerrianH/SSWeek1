package com.ss.training.dayfour;

/**
 * Thread used to test deadlocking
 * 
 * @author derrianharris
 */
public class DeadlockThreadB implements Runnable {
	Deadlock dl;
	String name;

	public DeadlockThreadB(Deadlock dl, String name) {
		this.dl = dl;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (dl.b != null) {
			synchronized (dl.b) {
				System.out.println(name + " locking b.");
				if (dl.a != null) {
					synchronized (dl.a) {
						System.out.println(name + " locking a.");
						System.out.println(name + " is not deadlocked.");
					}
				}
			}
		}
	}

}