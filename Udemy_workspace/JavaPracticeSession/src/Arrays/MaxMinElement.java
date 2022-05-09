package Arrays;

import java.util.Scanner;

public class MaxMinElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] arr=new int[size];
		int maximum=Integer.MIN_VALUE;
		int minimum=Integer.MAX_VALUE;
		
		System.out.println("The size of an array is "+size);
		
		for(int i=0; i<size; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.print("The elements in array are: ");
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]>maximum) {
				maximum=arr[i];
			}
			if(arr[i]<minimum) {
				minimum=arr[i];
			}
		}
		
		System.out.println("\nThe minimum and maximum values in array are: " +minimum+", "+maximum);
	}

}
