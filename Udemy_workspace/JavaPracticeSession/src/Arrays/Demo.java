package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		//aabbbbccdd
		//a=2
		//
//		
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
//		int i=0;
//		int j;
//		int count;
//		
//		while(i<str.length()) {
//			count=1;
//			for(j=i+1; j<str.length(); j++) {
//				
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//				}
//				else {
//					break;
//				}
//				
//			}
//			System.out.println(str.charAt(i)+" " +count);
//			i=j;
//			
//			
//		}
		
			
		
		
		// 2nd approach
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			
			int temp = map.getOrDefault(str.charAt(i), 0);
			
			map.put(str.charAt(i), ++temp);			
			
		}
		
		System.out.println(map);
		
//		map.entrySet().forEach(x -> {
//			
//			System.out.println(x.getKey()+""+x.getValue());
//			
//		});
		

	}

}
