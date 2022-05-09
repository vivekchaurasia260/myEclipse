package DemoProgram1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		char operation=scan.next().charAt(0);
		int result=0;
		
		switch(operation) {
			
			case '+' :
				result=num1+num2;
				System.out.println("The addition of number is " +result);
				break;
			case '*':
				result=num1*num2;
				System.out.println("The multiplication of number is " +result);
				break;
			case '-':
				result=num1-num2;
				System.out.println("The substraction of number is " +Math.abs(result));
				break;
			case '/':
				result=num1/num2;
				System.out.println("The division of number is " +result);
				break;
			default:
				System.out.println("Unknown operation...");
		}
		
	}
}
