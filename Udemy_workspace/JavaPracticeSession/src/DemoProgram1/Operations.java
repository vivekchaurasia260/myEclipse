package DemoProgram1;

import java.util.Scanner;

public class Operations {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		int operation=scan.nextInt();
		
		switch(operation) {
		
		case 1:
			System.out.println("Addition");
			int result1 = addition();
			System.out.println("The sum is "+result1);
			break;

		case 2:
			System.out.println("Multiplication");
			long result2=multiplication();
			System.out.println("The multiplication is " +result2);
			break;
		case 3:
			System.out.println("Division");
			int result3=division();
			System.out.println("The remainder is " +result3);
			break;
		case 4:
			System.out.println("Substraction");
			int result4=subtraction();
			System.out.println("The substraction is " +result4);
			break;
		default:
			System.out.println("Increment");
			int result5=incrementNum();
			System.out.println("The final number is " +result5);
		}
		
	}
	
	public static int addition() {
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		return num1+num2;
	}
	
	public static long multiplication() {
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		
		return num1*num2;
	}
	
	public static int division() {
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		return num1%num2;
	}
	
	public static int subtraction() {
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		return Math.abs(num1-num2);
	}
	
	public static int incrementNum() {
		int num=scan.nextInt();
		
		return num+2;
	}
}
