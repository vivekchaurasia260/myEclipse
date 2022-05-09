package Challenge;

import java.util.Scanner;

public class MinimumElement {
	
	static Scanner scan=new Scanner(System.in);
	
	public static int[] readIntegers(int count) {
		int[] arr=new int[count];
	
		for(int i=0; i<count; i++) {
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	
	public static int findMin(int[] arr) {
		int min_num=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min_num) {
				min_num=arr[i];
			}
		}
		return min_num;
	}
	
	public static void main(String[] args) {
		
		int count=scan.nextInt();
		
		MinimumElement minEle=new MinimumElement();
		int[] arr=readIntegers(count);
		System.out.println("Minimum number in array is "+findMin(arr));
	}
}
