package Multithreading;

public class ThreadPrevention {
	public static Thread mainThread = Thread.currentThread();
	public static void main(String[] args) throws InterruptedException {
		
	//	Thread.currentThread().join(); -> This line will make program stucked and will go in deadlock state....
		
		MyThread1 thread = new MyThread1();
		thread.start();
		
	//	thread.join();	-- We are putting join on child object so main thread will move to waiting state till child complete its execution..
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		
	}
}

class MyThread1 extends Thread {
	
	public void run() {
		
		try {
			//ThreadPrevention.mainThread.join();		
			
			for(int i=0; i<10; i++) {
				System.out.println("pp Thread");
				
			//	Thread.yield();
			}
		}
		catch(Exception exc) {
			System.out.println("Getting Exception");
		}
		
	}
	
}
