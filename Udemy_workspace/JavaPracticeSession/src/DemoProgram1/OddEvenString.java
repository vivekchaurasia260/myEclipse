package DemoProgram1;

import java.util.Scanner;

public class OddEvenString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		// length with space count...
		
		System.out.println("String Length is: " + str.length());
		
		System.out.println(str.length()%2==0 ? "String is of even length" : "String is of odd length");
		
		// number of letters....
		
		int i=0, count=0;
		while(i<str.length()) {
			
			if(str.charAt(i)!=' ') {
				count++;
			}
			i++;
		}
		
		System.out.println("Total number of character in a given string is: " +count);
		
		System.out.println(count%2==0 ? "Total character is of even length" : "Total character is of odd length");
	}

}
