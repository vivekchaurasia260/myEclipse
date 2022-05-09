package DemoProgram1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
	//	boolean result = isPrime(num);
	//	System.out.println(result ? "Number is prime" : "Number is not prime");
		
		allPrime(num);
	}
	
	public static boolean isPrime(int num) {
		
		if(num<=1) 
			return false;
		
		for(int i=2; i<Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	// All prime number in the given range..
	
	public static void allPrime(int num) {
		
		for(int i=1; i<num; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

}
