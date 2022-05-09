package DemoProgram1;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] array={6,2,5,8,4,3,1,9};
		int missingNumber = findMissingNum(array);
		System.out.println("Missing Number is "+ missingNumber);

	}
	
	public static final int findMissingNum(int[] array) {
		
		int n=array.length+1;
		int sumOfFirstNNums = n*(n+1)/2;
		
		System.out.println(sumOfFirstNNums);
		int actualSum = 0;
		
		for(int x:array)
			actualSum+=x;
		
		return sumOfFirstNNums - actualSum;
		
	}

}
