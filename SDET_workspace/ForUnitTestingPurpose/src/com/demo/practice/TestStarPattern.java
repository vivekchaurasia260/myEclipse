package com.demo.practice;

import java.util.Scanner;

public class TestStarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j<=i)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	System.out.println("--------------------------------------------------------------------------------------");	
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j>=(n-1)-i)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		double d = 150.86;
		byte b = 90;
		
		
		byte r1 = (byte)d;
		byte r2 = (byte)b;
		
		System.out.println("----------------------------------------");
		System.out.println(r1+"  "+r2);
		

	}

}
