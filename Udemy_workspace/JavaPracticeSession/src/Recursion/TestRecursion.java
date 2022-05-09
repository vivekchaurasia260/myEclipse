package Recursion;

import java.util.Scanner;

public class TestRecursion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		isRecursion(num);
	}
		
	public static void isRecursion(int num) {
		
		if(num==0) {
			return;
		}
		
		 isRecursion(num-1);
		 System.out.println(num);
		
	}

}
