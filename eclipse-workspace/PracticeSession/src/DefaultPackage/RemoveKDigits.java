package DefaultPackage;

import java.util.Scanner;

public class RemoveKDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		int k=scan.nextInt();
		
		int result=removeKDigit(str, k);
		System.out.println(result);
		
	}
	
	public static int removeKDigit(String str, int k) {
		
		int i, minValue=Integer.MAX_VALUE;
		
		for(i=0; i<str.length()-k; i++) {
		
			int subVal = Integer.parseInt(str.replace(str.substring(i, k+i), ""));
			
			if(minValue>subVal)
				minValue=subVal;
			
			System.out.println(subVal);
		}
		
		return minValue;
		
	}

}
