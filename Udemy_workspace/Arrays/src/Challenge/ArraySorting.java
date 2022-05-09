package Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	private static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		int size=scan.nextInt();
		int[] arr=new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=scan.nextInt();
		}
		printArray(arr);
		System.out.println();
		int[] sortedArray=arraySorting(arr, size);
		printArray(sortedArray);
		
		
	}
	
	public static int[] arraySorting(int[] arr, int size) {
		
//		int[] sortedArray=new int[size];
//		
//		for(int i=0; i<size; i++) {
//			sortedArray[i]=arr[i];
//		}
		
		int[] sortedArray=Arrays.copyOf(arr, size);
		
		boolean flag=true;
		int temp;
		while(flag) {
			flag=false;
			
			for(int i=0; i<size-1; i++) {
				if(sortedArray[i]<sortedArray[i+1]) {
					temp=sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=temp;
					flag=true;
				}
			}
		}
		
		return sortedArray;
	}
	
	public static void printArray(int[] arr) {
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
}
