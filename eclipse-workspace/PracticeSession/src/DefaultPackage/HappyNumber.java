package DefaultPackage;

import java.util.Scanner;

public class HappyNumber {
	
	
	public boolean isHappy(int num) {
			int rem, result=0;
				
				while(num!=0) {
					rem=num%10;
					result += rem*rem;
					num /= 10;
				}
				if(result==1) {
					return true;
				}
			
				return isHappy(result);
	}
	
	public static void main(String[] args) {
		boolean result=false;
		Scanner scan=new Scanner(System.in);
		for(int i=10; i<100; i++) {
		result = false;
		HappyNumber happy = new HappyNumber();
		try {
			 result = happy.isHappy(i);
		 }
		catch(StackOverflowError j) {
			
		}
		
		System.out.println(i + " " + result);
		}
		
	}
}
