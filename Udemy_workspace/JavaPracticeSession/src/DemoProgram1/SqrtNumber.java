package DemoProgram1;

import java.util.Scanner;

public class SqrtNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		
		int res = findSqrt(num);
		
		System.out.println("The root of a number is " + res);
		
	}
	
	public static int findSqrt(int num) {
		
		int start = 2;
		int end = num ;		
		int ans=0;
		
		if(num==0 || num==1)
			return num;
	
		
		while(start<=end) {
			
			int mid=(start+end)/2;
				
			if(mid*mid==num) {
				return mid;
			}
			else if(mid*mid<num) {
				start=mid+1;
				ans=mid;
			}
			else {
				end=mid-1;
			}
			
		}
		
		if(start>end) {
			System.out.println("Not able to find sqrt");
		}
		
		return ans;
		
		/*
		 while (start <= end)
        {
            int mid = (start + end) / 2;
 
            // If x is a perfect square
            if (mid*mid == x)
                return (int)mid;
 
            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (mid*mid < x)
            {
                start = mid + 1;
                ans = mid;
            }
            else   // If mid*mid is greater than x
                end = mid-1;
        }
        return (int)ans;
    }
		  
		 */
		
		
	}

}
