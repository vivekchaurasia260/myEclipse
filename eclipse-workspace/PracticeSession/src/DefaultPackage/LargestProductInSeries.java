package DefaultPackage;

import java.util.Scanner;

public class LargestProductInSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int testCases=scan.nextInt();
		   
		while(--testCases>=0) {
			int maxValue=-1, rem=1;
			int n=scan.nextInt();
			int k=scan.nextInt();
			String num=scan.next();
            for(int i=0; i<=n-k; i++) {
            	rem=1;
                int subInt =Integer.parseInt(num.substring(i, k+i));
                                
                while(subInt!=0) {
                    rem = rem * (subInt%10);
                    subInt /=10;
                }
   
                if(rem>maxValue)
                    maxValue=rem;
            }
            System.out.println(maxValue);                    

        }
	}

}
