package DefaultPackage;

import java.util.Scanner;

public class Hour_Glass {

	public static void main(String[] args) {
		 int rows, column, sum=0, result=0;
		 int[][] arr = new int [6][6];
		 Scanner scan=new Scanner(System.in);
		 	for(rows=0; rows<arr.length; rows++) {
		 		for(column=0; column<arr.length; column++) {
		 			arr[rows][column] = scan.nextInt();
		 		}
		 	}
	        for(rows=0; rows<4; rows++) {
	            for(column=0; column<4; column++) {
	              sum = (arr[rows][column] + arr[rows][column+1] + arr[rows][column+2]) + (arr[rows+1][column+1]) + (arr[rows+2][column] + arr[rows+2][column+1] + arr[rows+2][column+2]);        
	            }
	            result = Math.max(sum, result);
	        }
	           // return result;

	}

}
