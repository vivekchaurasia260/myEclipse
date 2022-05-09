package Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	public static void reverse(int[] arr) {
		int len=arr.length;
		int temp;
		for(int i=0; i<len/2; i++) {
			temp=arr[i];
			arr[i]=arr[len-1-i];
			arr[len-1-i]=temp;
		}
	}
	
	public static void print(int[] arr) {
//		System.out.println("Elements in arrays: ");
//		for(int x:arr) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
		
		System.out.println("Array = "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] arr=new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=scan.nextInt();
		}
		print(arr);
		reverse(arr);
		print(arr);
	}
	
}
