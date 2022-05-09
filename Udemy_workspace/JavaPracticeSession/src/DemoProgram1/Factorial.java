package DemoProgram1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		System.out.println("The Factorial of a number "+ num +" is: "+factorialNum(num));
	}
	
	public static int factorialNum(int num) {
		
		if(num<=1)
			return 1;
		
		return num*factorialNum(num-1);
	}

}
