package DemoProgram1;

import java.util.Scanner;

public class ArrayPairSum {
	
	public static boolean isPairSum(int[] arr, int x) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if((arr[i]+arr[j]==x) && i!=j) {
			//		System.out.println(arr[i]+" "+arr[j]);
					return true;
				}
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		
		int x = scan.nextInt();
		
		System.out.println(isPairSum(arr, x));
		

	}

}
