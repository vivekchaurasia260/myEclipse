package DemoProgram1;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String originalString=scan.nextLine();
		String actualChar=scan.next();
		String newChar=scan.next();
	
		System.out.println("Actual String is " +originalString);
		String modifiedString=originalString.replaceAll(actualChar, newChar);
		
		System.out.println("String after modification is " +modifiedString);
		
	}

}
