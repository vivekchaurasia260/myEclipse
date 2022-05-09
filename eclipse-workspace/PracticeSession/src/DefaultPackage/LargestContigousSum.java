package DefaultPackage;

public class LargestContigousSum {	
	
	public static void main(String[] args) {
		
	int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	
		int result = maximumSum(arr);	
		System.out.println(result);
	}
	
	public static int maximumSum(int[] arr) {		
		int max_sum=Integer.MIN_VALUE, sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			
			if(max_sum<sum) 
				max_sum=sum;
			if(sum<0)
				sum=0;
		}	
		
		return max_sum;
		
	}

}
