package DefaultPackage;

import java.util.Arrays;

public class LastStoneWeight {
	
	public static int lastStoneWeight(int[] arr, int length) {
		
		int len=length;
		
		if(len==1 || len<=0) 
			return arr[0];
		
		Arrays.sort(arr);
		
		int x=arr[len-2];
		int y=arr[len-1];
		
	
		if(x<=y) {
			if(x==y) {
				len--;
			}
			else {
				y=y-x;
				arr[len-2]=y;
			}
			len--;
		}
		
//		for(int i=0; i<len; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		return lastStoneWeight(arr, len) ;
		
	}
	
	

	public static void main(String[] args) {
		
		int[] arr = {3,5,3,6,4,8};
		
		int res = lastStoneWeight(arr, arr.length);

		 System.out.println(res);		

	}

}
