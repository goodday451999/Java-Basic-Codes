package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestThread {
	public static void main(final String[] arguments) throws InterruptedException {  
	      BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);  
	  
	      Insert i = new Insert(queue);  
	      Retrieve r = new Retrieve(queue);  
	  
	      new Thread(i).start();  
	      new Thread(r).start();  
	  
	      Thread.sleep(2000);  
	   }    
}
