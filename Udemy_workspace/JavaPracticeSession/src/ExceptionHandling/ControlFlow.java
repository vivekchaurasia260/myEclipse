package ExceptionHandling;

import java.util.List;

public class ControlFlow {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("stmt-1");
			System.out.println("stmt-2");
			System.out.println("stmt-3");
		}
		finally {
			System.out.println("stmt-5");
		}
		
		System.out.println("stmt-6");
		
	}

}
