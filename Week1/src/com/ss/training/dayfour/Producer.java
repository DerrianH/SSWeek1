/**
 * 
 */
package com.ss.training.dayfour;

import java.util.Random;

/**
 * Thread class that pushes random int values to the buffer, if it is empty.
 * 
 * @author derrianharris
 *
 */
public class Producer implements Runnable {

	ProducerConsumer pc;

	public Producer(ProducerConsumer pc) {
		this.pc = pc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		while (true) {
			synchronized (pc.buffer) {

				while (pc.bufferSize >= pc.buffer.length - 1) {
					try {
						pc.buffer.wait();
						System.out.println("Producer | Waiting...");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				for (int i = 0; i < pc.buffer.length; i++) {

					Integer r = rand.nextInt();
					pc.buffer[i] = r;
					System.out.println("Producer | Producing: " + pc.buffer[i]);

					pc.setBufferSize(pc.getBufferSize() + 1);
				}
				try
				{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex)
				{
				    Thread.currentThread().interrupt();
				}
				pc.buffer.notify();
			}
		}

	}

}
