package DemoProgram1;

import java.util.Scanner;

public class VowelCount {
	
	public int vowelCount(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
				case 'a' : 
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i' :
					count++;
					break;
				case 'o' :
					count++;
					break;
				case 'u' :
					count++;
					break;
				default :
					if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
						count++;
					}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		VowelCount vow=new VowelCount();
		
		System.out.println("Number of vowel in the string is " +vow.vowelCount(str));
	}
}
