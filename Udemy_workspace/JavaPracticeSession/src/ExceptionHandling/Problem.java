package ExceptionHandling;

public class Problem {

	public static void main(String[] args) {
		
		InterviewBit ib=new InterviewBit();
		int result = ib.calculate(2, 3);
		System.out.println("Result " + result);

	}

}

class InterviewBit {
	
	int calculate(int a, int b) {
		
		try {
			System.out.println("Inside Try");
			return a-b;
		}
		catch(Exception exc) {
			System.out.println("Inside Catch");
			return a+b;
		}
		finally {
			System.out.println("Inside finally");
			return a*b;
		}
		
	}
	
}
