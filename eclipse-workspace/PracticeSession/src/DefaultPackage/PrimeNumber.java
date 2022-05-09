package DefaultPackage;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		boolean res=isPrime(num);
		System.out.println(res);

	}
	
	public static boolean isPrime(int num) {
		boolean flag=true;
		
		if(num==1)
			return false;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
