package Java8Features;

interface I {
	
	public void m1();
	
	public void m2();
	
	default void m3() {
		System.out.println("Default method");
	}
	public static void m4() {
		System.out.println("This is static method");
	}
	
}

public class JavaDefaultStatic implements I{
	
	public void m1() {
		
	}
	public void m2() {
		
	}

	public static void main(String[] args) {
		
		JavaDefaultStatic jd = new JavaDefaultStatic();
		jd.m3();
		
		I.m4();		// We can call static method by using interface name only...static method property will not came in implemented class.
		
	}

}
