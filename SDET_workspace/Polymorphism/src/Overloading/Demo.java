package Overloading;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class Demo {
	
	public static void main(String[] args) {
				
//		String str="stress";
//		
//		String rev="";
//		for(int i=str.length()-1; i>=0; i--) {
//			
//			rev+=str.charAt(i);
//			
//		}
//		
//		Map<Character, Integer> map = new LinkedHashMap<>();
//		
//		for(int j=0; j<rev.length(); j++) {
//			
//			int temp = map.getOrDefault(rev.charAt(j), 0);
//			
//			map.put(rev.charAt(j), ++temp);
//			
//		}
//		
//		
//		System.out.println(map);
//		
//		Optional<Entry<Character, Integer>> result = map.entrySet().stream().filter(entry -> entry.getValue()==1).findFirst();
//		
//		
//		System.out.println(result.get());
		
		
		
		// Prime...
		
		
		
		// 315, 12
		
		// 3 3 5 7
		
		
		
		int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};
		
		int sum1=Integer.MIN_VALUE;
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(sum1<sum) {
				sum1=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		
		
		System.out.println(sum1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
