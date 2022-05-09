package DemoProgram1;

import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		WordCount count=new WordCount();
		String str=scan.nextLine();
			
		System.out.println("Total number of word in a given string is: " +count.wordCount(str));
			
	}
	
	public int wordCount(String str) {
		int count=0;
		String[] arr = str.split(" ");
		
		for(String res : arr) {
			if(res!=null && res.trim().length()!=0) {
				count++;
			}
		}
		
		return count;
	}
}
