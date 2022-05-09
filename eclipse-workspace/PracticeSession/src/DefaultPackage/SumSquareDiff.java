package DefaultPackage;

import java.util.Scanner;

public class SumSquareDiff {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		int S1 = (num*(num+1)*(2*num+1))/6;
		
		int S2 = (num*(num+1))/2;
		
		//S2=(int) Math.pow(S2, 2);
		
		System.out.println(S1+" "+S2);

	}

}
