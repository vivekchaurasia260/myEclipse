package DefaultPackage;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int i, j, k=0, result=0, prod=1;
		
		for(i=1; i<=num; i++)
			prod*=i;
		
		System.out.println(prod);
		
		for(i=num; i<=prod; i+=num) {
			k=i;
			for(j=2; j<=num; j++) {
				if(k%j==0) {
					flag=true;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				break;
			}
		}
		
		System.out.println(k);		
		

	}

}
