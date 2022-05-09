package DemoProgram1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchProg {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
		
		int low = 0; 
		int high = arr.length;
		int element = scan.nextInt();
		
		
//		int index = searchElement(arr, element);
		
		
		int index = searchElement(arr, low, high, element);
		
		System.out.println("The index is " + index);
		
		System.out.println("Print arrays element by using stream");
		
		Arrays.stream(arr).filter(ele -> ele==50).forEach(System.out::println);

	}

	// 1st approach by using while loop
	
/*	public static int searchElement(int[] arr, int element) {
		
		int low=0;
		int high=arr.length-1;
		
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			if(arr[mid]==element) {
				return mid;
			}
			else if(arr[mid]>element) {
				high = mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		
		if(low>high) {
			System.out.println("Element not found");
		}
		
		return -1;
		
	}
	
*/
	
	
	// 2nd approach by using recursion technique...
	
	public static int searchElement(int[] arr, int low, int high, int element) {
		
		// {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
		
		if(high>=low) {
			int mid = low + (high-1)/2;
			
			if(arr[mid]==element) {
				return mid;
			}
			else if(arr[mid]>element) {
				return searchElement(arr, low, mid-1, element);
			}
			
			return searchElement(arr, mid+1, high, element);
			
		}
				
		return -1;
		
	}
	
	
	
	
	

}
