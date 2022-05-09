package Java8Features;

@FunctionalInterface
public interface FunctionalInterface1 {
	
	public void m1();
	
	public static void m2() {
		
	}
	
	default void m3() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is interface");
	}

}
