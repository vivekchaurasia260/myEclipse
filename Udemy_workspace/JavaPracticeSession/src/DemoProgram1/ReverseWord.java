package DemoProgram1;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "   This is    my world";
		
		String[] arr = str.split(" ");
		
		String ans="";
		
		for(int i=arr.length-1; i>=0; i--) {
			
			ans += arr[i] + " ";
			
		}
		
		System.out.println(ans.substring(0, ans.length()-1));
		
	}

}
