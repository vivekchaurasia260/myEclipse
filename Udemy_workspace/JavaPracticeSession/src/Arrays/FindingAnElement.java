package Arrays;

import java.util.Scanner;

public class FindingAnElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] arr=new int[size];
		int element=scan.nextInt();
		boolean flag=false;
		
		System.out.println("The size of an array is "+size);
		
		for(int i=0; i<size; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.print("The elements in array are: ");
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]==element) {
				flag=true;
			}
		}

		System.out.println(flag ? "\nElement is present in array" : "\nElement is not present in array");
	}

}
