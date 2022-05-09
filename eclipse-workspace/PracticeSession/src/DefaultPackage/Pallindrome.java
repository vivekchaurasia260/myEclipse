package DefaultPackage;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		
		boolean result=isPallindrome(input);
		
		System.out.println(result);

	}
	
	public static boolean isPallindrome(int input) {
		long sum=0;
		int temp=input;
		
		while(input>0) {
			sum = (sum*10) + (input%10);
			input/=10;
		}
			
		if(temp==sum)
			return true;
		
		
		return false;
	}

}
