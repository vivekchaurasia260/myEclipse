package DemoProgram1;

import java.util.Scanner;

public class IdenticalLetter {
	
	public static boolean identicalLetters(String str) {
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		System.out.println(identicalLetters(str) ? "True" : "False");

	}

}
