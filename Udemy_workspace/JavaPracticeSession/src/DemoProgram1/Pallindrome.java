package DemoProgram1;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str = scan.next();
		
		boolean result=isPallindrome(str);
		System.out.println(result ? "It is Pallindrome" : "It is not a pallindrome");
	}
	
	public static boolean isPallindrome(String str) {
		
		// By using StringBuilder..
		
//		String temp=str;
//		StringBuilder sb=new StringBuilder(str);
//		
//		return sb.reverse().toString().equals(str);
		
		
		// by using recursion.
		
		String reverseString = reverse(str);
		
		if(reverseString.equals(str))
			return true;
		
		return false;
	}
	
	public static String reverse(String str) {
		
		if(str==null || str.isEmpty())
			return str;
		
		
		return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
	}
	
	
//	Pallindrome prg without using string builder...
		
//	public static boolean isPallindrome(String str) {
//		int i=0;
//		while(i<str.length()/2) {
//			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
//				return false;
//			}
//			i++;
//		}
//		
//		return true;
//	}

}
