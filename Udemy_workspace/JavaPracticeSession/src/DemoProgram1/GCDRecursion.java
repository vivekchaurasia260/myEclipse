package DemoProgram1;

import java.util.Scanner;

public class GCDRecursion {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num1=scan.nextInt();
		
		int num2=scan.nextInt();
		
		
		int result = findGCD(num1,num2);
				
		System.out.println(result);
	}
	
	public static int findGCD(int num1, int num2) {
		
		if(num1==0) 
			return num2;
		
		if(num2==0)
			return num1;
		
		if(num1==num2)
			return num1;
		
		if(num1>num2)
			return findGCD(num1-num2, num2);

		
		return findGCD(num1, num2-num1);
		
		
		/* 2nd approach..
		 * 
		 * if(a==0)
		 * 	return b;
		 * 
		 * return findGCD(b%a, a);
		 *
		 */
		
	}

}
