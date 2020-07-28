package concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerProblem {
	public static void main(String args[]) {
		// The java.util.concurrent.BlockingQueue is the subinterface of Queue 
		// that supports the operations such as waiting for the space availability 
		// before inserting a new value or waiting for the queue to become non-empty 
		// before retrieving an element from it.
		
		// Creating shared object
		BlockingQueue sharedQueue =  new LinkedBlockingQueue();
		
		// Producer Thread
		Thread producer = new Thread(new Producer(sharedQueue));
		
		// Consumer Thread
		Thread consumer = new Thread(new Consumer(sharedQueue));
		
		// Starting threads
		producer.start();
		consumer.start();
	}
}
