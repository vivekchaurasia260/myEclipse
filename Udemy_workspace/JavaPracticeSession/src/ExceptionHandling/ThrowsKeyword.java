package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		throw new ArithmeticException("This is Exception");
//		doStuff();
	}
	
	public static void doStuff() {
		doMoreStuff();
	}
	
	public static void doMoreStuff()  {
		
	//	Thread.sleep(1000);
		
	}

}
