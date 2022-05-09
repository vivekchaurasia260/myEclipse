package DefaultPackage;

import java.util.Scanner;

public class LongestCollatzsequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int testCases=scan.nextInt();
        int maxTerm, index=0;
        int count;
        while(--testCases>=0) {
            int num=scan.nextInt();
            maxTerm=Integer.MIN_VALUE;
            for(int i=num; i>0; i--) {
               int val=i;
               count=0;
               while(val>1) {
                   if(val%2==0) {
                       val=val/2;
                       count++;
                   }
                   else if(val==1)
                       break;
                   else {
                       val = 3*val + 1;
                       count++;
                   }
               }
               System.out.println(count);
               if(maxTerm<count) {
                    maxTerm=count;                 
                    index=i;
               } 
            }
            System.out.println(index);
        }

	}

}
