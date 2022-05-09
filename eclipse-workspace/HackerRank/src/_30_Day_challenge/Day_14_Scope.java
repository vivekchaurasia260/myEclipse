package _30_Day_challenge;

import java.util.Scanner;

class Difference {
	private int[] elements;
	int maximumDifference;
	
	public Difference(int[] arr) {
		elements=arr;
	}
	
	public void computeDifference() {
		int diff=0;
		
		for(int i=0; i<elements.length-1; i++) {
			for(int j=i+1; j<elements.length; j++) {

				diff=Math.abs(elements[i]-elements[j]);
				maximumDifference=Math.max(diff, maximumDifference);
			}
		}
		System.out.println("The maximum difference is "+maximumDifference);
	}
	
}

public class Day_14_Scope {
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scan.nextInt();
	        }
	        scan.close();

	        Difference difference = new Difference(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);		
	}
}


