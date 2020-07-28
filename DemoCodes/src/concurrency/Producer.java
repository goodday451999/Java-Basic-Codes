package concurrency;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private final BlockingQueue sharedQueue;
	
	
	public Producer(BlockingQueue sharedQueue) {
//		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println("Produced: " + i);
				sharedQueue.put(i);  
			}catch (Exception e) {
				// TODO: handle exception
			}			
//			catch (InterruptedException e) {
//				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, e); 
//			}
		}

	}

}
