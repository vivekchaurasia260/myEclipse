package DefaultPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
	
	
	public static boolean isAnagram(String str1, String str2) {
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		if(len1!=len2)
			return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0; i<len1; i++) 
			if(arr1[i] != arr2[i]) 
				return false;
		
		return true;	
		
	}
	
	public List<List<String>> groupAnagram(String[] str) {
		
		int length=str.length;
		
		List<List<String>> result = new ArrayList<List<String>>();
		
		for(int i=0; i<length-1; i++) {
			for(int j=i+1; j<length; j++) {
				if(isAnagram(str[i], str[j])) {
					result.get(i).add(str[j]);
				}
			}
		}
		
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		String[] input =  {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		GroupAnagram anagram = new GroupAnagram();
		
		List<List<String>> result = anagram.groupAnagram(input);
		
		System.out.println("Group of Anagram are: "+result);
		
		
			
	}

}
