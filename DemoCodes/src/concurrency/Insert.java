package concurrency;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Insert implements Runnable{
	private BlockingQueue<Integer> queue;  
	  
    public Insert(BlockingQueue queue) {  
       this.queue = queue;  
    }  

    @Override  
    public void run() {  
       Random random = new Random();  

       try {  
          int result = random.nextInt(200);  
          Thread.sleep(1000);  
          queue.put(result);  
          System.out.println("Added: " + result);  
            
          result = random.nextInt(10);  
          Thread.sleep(1000);  
          queue.put(result);  
          System.out.println("Added: " + result);  
            
          result = random.nextInt(50);  
          Thread.sleep(1000);  
          queue.put(result);  
          System.out.println("Added: " + result);  
       } catch (InterruptedException e) {  
          e.printStackTrace();  
       }  
    }      
}
