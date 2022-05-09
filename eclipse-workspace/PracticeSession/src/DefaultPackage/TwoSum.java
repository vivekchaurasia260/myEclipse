package DefaultPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int target=scan.nextInt();
		int[] arr = {2,7,11,15};
		
		int[] result = twoSum(arr, target);		

	}
	
	public static int[] twoSum(int[] arr, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			int diff=target-arr[i];
			
			if(map.containsKey(diff)) {
				
			}
			
			map.put(arr[i], i);
		}
		
		return arr;
	}

}
