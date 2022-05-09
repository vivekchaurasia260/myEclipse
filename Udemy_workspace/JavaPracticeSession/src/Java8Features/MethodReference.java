package Java8Features;

public class MethodReference {
	
	public static void m1() {
		
		for(int i=0; i<5; i++) {
			System.out.println("Child is static method");
		}
	}

	public static void main(String[] args) {
		
		Runnable r = MethodReference::m1;
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Parent Thread");
		}
		

	}

}
