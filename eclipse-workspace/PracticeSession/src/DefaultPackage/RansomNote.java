package DefaultPackage;

import java.util.Scanner;

public class RansomNote {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String ransomNote=scan.next();
		String magazine=scan.next();
		
		boolean result=canConstruct(ransomNote, magazine);
		
		System.out.println(result);

	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		
		if(ransomNote==null || magazine==null)
			return true;
		
		 for(int i=0; i<magazine.length()-ransomNote.length(); i++) {            
	            if(ransomNote.equals(magazine.substring(i, ransomNote.length()+i))) {
	                return true;
	            }     
//			 String split=magazine.substring(i, ransomNote.length()+i);
			 
			// System.out.println(split);
	        }
		 
		 return false;
	}

}
