package Multithreading;

public class ThreadExampleRunnableInterface {
	
	public static void main(String[] args) {
		
		RunnableThread r = new RunnableThread();
		Thread t1 = new Thread(); 
		Thread t2 = new Thread(r);
		t2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Parent-Thread");
		}
			
		Thread.currentThread().setPriority(5);
		System.out.println("Main Thread " + Thread.currentThread().getPriority());
		
		
		
	}

}

class RunnableThread implements Runnable {

	public void run() {
		
		Thread.currentThread().setPriority(7);
		
		for(int i=0; i<5; i++) {
			System.out.println("Child-Thread");
		}
		
	}
	
}
