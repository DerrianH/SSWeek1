/**
 * 
 */
package com.ss.training.dayfour;

/**
 * Starts the producer and consumer
 * 
 * @author derrianharris
 *
 */
public class ProducerConsumer {

	/**
	 * @param args
	 */

	Integer bufferSize = 0;
	Integer maxBufferSize = 5;
	Integer[] buffer = new Integer[maxBufferSize];

	public Integer getBufferSize() {
		return bufferSize;
	}

	public void setBufferSize(Integer bufferSize) {
		this.bufferSize = bufferSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer pc = new ProducerConsumer();

		Runnable prod = new Producer(pc);
		Runnable cons = new Consumer(pc);

		Thread prodThread = new Thread(prod);
		Thread consThread = new Thread(cons);

		consThread.start();
		prodThread.start();

	}

}
