/**
 * 
 */
package com.ss.training.dayfour;

/**
 * Thread class that consumes random int values one the buffer, if it is full.
 * 
 * @author derrianharris
 *
 */
public class Consumer implements Runnable {

	ProducerConsumer pc;

	public Consumer(ProducerConsumer pc) {
		this.pc = pc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			synchronized (pc.buffer) {

				while (pc.bufferSize < pc.buffer.length - 1) {
					try {
						pc.buffer.wait();
						System.out.println("Consumer | Waiting...");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				for (int i = 0; i < pc.buffer.length; i++) {

					System.out.println("Consumer | Consuming: " + pc.buffer[i]);

					pc.buffer[i] = null;
					pc.setBufferSize(pc.getBufferSize() - 1);

				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				pc.buffer.notify();
			}
		}

	}

}
