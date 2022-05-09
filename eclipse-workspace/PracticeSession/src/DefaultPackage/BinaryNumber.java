// Program to print number of consistence one in the binary of a number.
package DefaultPackage;

import java.util.Scanner;

public class BinaryNumber {
	
	public static void main(String[] args) {
		
		int count, res=0;
		String sum="";
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		while(num>0) {
			int rem=num%2;
			sum = sum +""+ rem;
			num = num/2;
		}
		
		for(int j=0; j<sum.length()-1; j++) {
			count=1;
			for(int k=j+1; k<sum.length(); k++) {
				if(sum.charAt(j)=='1' && sum.charAt(k)=='1') {
					count++;
				}
				else {					
					break;
				}
			}
			if(res<count)
				res=count;	
		}
		
		System.out.println(res);
				
	}

}
