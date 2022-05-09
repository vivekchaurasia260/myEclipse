
// In this there are three approaches to create the String Anagram..

package DefaultPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		
		
		// This is 1st approach
		
		Scanner scan=new Scanner(System.in);
//		String str=scan.next();
//		String p=scan.next();
//		List<Integer> list=new ArrayList<Integer>();
//		for(int i=0; i<str.length()-p.length()+1; i++) {
//			if(isAnagram(str.substring(i, p.length()+i), p)) {
//				list.add(i);
//			}
//		}
//		
//		System.out.println(list);
//
//	}
//	
//	public static boolean isAnagram(String str, String p) {
//		
//		if(str.length()!=p.length())
//			return false;
//		
//		char[] ch1=str.toCharArray();
//		char[] ch2=p.toCharArray();
//		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		for(int i=0; i<ch1.length; i++) {
//			if(ch1[i]!=ch2[i])
//				return false;
//		}
//		
//		return true;
//		
		
		
		String str1=scan.next();
		String str2=scan.next();
		
//		char[] arr1=str1.toCharArray();
//		char[] arr2=str2.toCharArray();
		
		boolean result=isAnagram(str1, str2);
		
		System.out.println(result);
		
	}
	
	// Another way to create the String Anagram.....
	
//	public static boolean isAnagram(char[] arr1, char[] arr2) {
//		
//		int maxSize=256;
//		
//		int[] count1=new int[maxSize];
//		int[] count2=new int[maxSize];
//		
//		Arrays.fill(count1, 0);
//		Arrays.fill(count2, 0);
//		
//		for(int i=0; i<arr1.length && i<arr2.length; i++) {
//			count1[arr1[i]]++;
//			count2[arr2[i]]++;
//		}
//		
//		if(count1.length!=count2.length)
//			return false;
//		
//		for(int i=0; i<maxSize; i++) {
//			if(count1[i]!=count2[i])
//				return false;
//		}
//		
//		return true;
//	}
	
	// This another way to create the String Anagram
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length()!= str2.length())
			return false;
		
		int[] count1=new int[26];
		int[] count2=new int[26];
		
		for(char c:str1.toCharArray()) {
			count1[c-'a']++;
		}
		
		for(char c:str2.toCharArray())
			count1[c-'a']--;
		
		for(int i=0; i<count1.length && i<count2.length; i++) {			
			if(count1[i]>0)
				return false;			
		}
				
		return true;	
		
	}

}
