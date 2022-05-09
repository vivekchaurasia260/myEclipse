package DefaultPackage;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int N=100;
		int a=1;
		int b=2;
		int c=0, sum=0;
		
		
		
		System.out.print(a+" "+b+" ");
		
		while(c<=N)	{	
	
			c=a+b;
			a=b;
			b=c;
			
			if(a%2==0)
				sum+=a;
			
			System.out.print(c+" ");
		}
		
		System.out.println(sum);

	}

}
