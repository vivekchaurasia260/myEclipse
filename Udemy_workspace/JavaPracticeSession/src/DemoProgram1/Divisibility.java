package DemoProgram1;

import java.util.Scanner;

public class Divisibility {

	public static void fizzBuzz(int num) {
		
		if(num%3==0 && num%5==0)
			System.out.println("FizzBuzz");
		else if(num%3==0)
			System.out.println("Fizz");
		else if(num%5==0)
			System.out.println("Buzz");
		else
			System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		fizzBuzz(num);
	
	}

}
