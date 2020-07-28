package concurrency;

import java.util.concurrent.BlockingQueue;

public class Retrieve implements Runnable{
	private BlockingQueue<Integer> queue;  
	  
    public Retrieve(BlockingQueue queue) {  
       this.queue = queue;  
    }  
      
    @Override  
    public void run() {  
         
       try {  
          System.out.println("Removed: " + queue.take());  
          System.out.println("Removed: " + queue.take());  
          System.out.println("Removed: " + queue.take());  
       } catch (InterruptedException e) {  
          e.printStackTrace();  
       }  
    }  
}
