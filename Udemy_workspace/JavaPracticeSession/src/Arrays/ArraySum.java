package Arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] arr=new int[size];
		
		System.out.println("The size of an array is "+size);
		for(int i=0; i<size; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.print("The elements in array are: ");
		int sum=0;
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		
		System.out.println("\nThe sum of array elements are "+sum);
	}

}
