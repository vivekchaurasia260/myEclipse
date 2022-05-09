package Overriding;

public class ArraysOfMultiples {

	public static int sum(int[] arr) {
		int arrSum=0;
		
		if(arr.length==0)
			return 0;
		
		for(int i=0; i<arr.length; i++) {
			arrSum+=arr[i];
			return sum(arr);
		}
		
		return arrSum;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		int result = sum(arr);

		System.out.print(result);
	}
	
}
