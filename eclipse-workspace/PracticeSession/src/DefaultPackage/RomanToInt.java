package DefaultPackage;


import java.util.HashMap;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000 */

import java.util.Scanner;
public class RomanToInt {
                                                                                   
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		
		RomanToInt rti = new RomanToInt();
		
		int result = rti.intToRoman(str);

		System.out.println(result);
	}
	
	public int intToRoman(String s) {
		
		int res=0;
		
		for(int i=0; i<s.length(); i++) {
			switch(s.charAt(i)) {
				
			case 'M': {
				res +=1000;
				break;
			}
			case 'D': {
				res+=500;
				break;
			}
			case 'C': {
				if(i+1 <s.length() && s.charAt(i+1)=='M' || s.charAt(i+1)=='D') {
					res -=100;
				}
				else
					res+=100;
				break;
			}
			case 'L': {
				if(i+1 < s.length() && s.charAt(i+1)=='D' || s.charAt(i+1)=='M')
					res-=50;
				else
					res+=50;
				break;
			}
			case 'X': {
				if(i+1 <s.length() && s.charAt(i+1)=='L' || s.charAt(i+1)=='C' || s.charAt(i+1)=='D' || s.charAt(i+1)=='M' ) 
					res-=10;
				else
					res+=10;
				break;
			}
			
			case 'V': {
				if(i+1 <s.length() && s.charAt(i+1)=='X' || s.charAt(i+1)=='L' || s.charAt(i+1)=='C' || s.charAt(i+1)=='D' || s.charAt(i+1)=='M' ) 
					res-=5;
				else
					res+=5;				
				break;
			}
			case 'I': {
				if(i+1 <s.length() && s.charAt(i+1)=='V' || s.charAt(i+1)=='X' || s.charAt(i+1)=='L' || s.charAt(i+1)=='C' || s.charAt(i+1)=='D' || s.charAt(i+1)=='M' ) 
					res--;
				else
					res++;
				break;
			}
			default: {
				break;
			}
			}
		}
		return res;
	}


}
