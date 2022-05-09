package Java;

import java.util.Scanner;
import java.util.TreeSet;

public class JavaSubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest="";
		String largest="";
		
		TreeSet<String> treeSet=new TreeSet<>();
		
		for(int i=0; i<(s.length()-k)+1; i++) {
			treeSet.add(s.substring(i, i+k));
		}
		smallest=treeSet.pollFirst();
		largest=treeSet.pollLast();
		
		return smallest + "\n" + largest;
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}

}
