package concurrency;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private final BlockingQueue sharedQueue;  
	  
    public Consumer (BlockingQueue sharedQueue) {  
        this.sharedQueue = sharedQueue;  
    }  
    
    @Override  
    public void run() {  
        while(true){  
            try {  
                System.out.println("Consumed: "+ sharedQueue.take());  
            } catch (Exception e) {
				// TODO: handle exception
			}
//            catch (InterruptedException ex) {  
//                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);  
//            }  
        }  
    }  

}
