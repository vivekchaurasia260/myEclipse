package DemoProgram1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num=scan.nextInt();
		
//		for(int i=0; i<num; i++) {
//			
//			System.out.print(findFibo(i)+" ");
//			
//		}
		
		
		findByLoop(num);

	}
	
	
	// 1st approach by using recursion..
	
/*	public static int findFibo(int num) {
		
		if(num<=1)
			return num;
		
		return findFibo(num-1) + findFibo(num-2);
		
	}
	
*/	
	
	// 2nd approach by using for loop..
	
	public static void findByLoop(int num) {
		
		int num1=0;
		int num2=1;
		
		
		for(int i=0; i<num; i++) {
			
			System.out.print(num1+" ");
			
			int num3 = num1+num2;
			num1=num2;
			num2=num3;			
		}
		
	}

}
