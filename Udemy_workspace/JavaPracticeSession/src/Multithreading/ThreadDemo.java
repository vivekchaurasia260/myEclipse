package Multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Parent-Thread");
		}
		
		System.out.println("Main method name " + Thread.currentThread());

	}

}

class MyThread extends Thread {
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread");
		}
		
		System.out.println("Child method name " + Thread.currentThread());
	}
}
