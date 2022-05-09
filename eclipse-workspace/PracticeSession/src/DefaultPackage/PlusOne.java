package DefaultPackage;

import java.util.ArrayList;
import java.util.List;

// Google, ebay....
public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {9};
		
		int[] res=plusOne(arr);
		
		for(int index=0; index<res.length; index++) {
			System.out.print(arr[index]+" ");
		}

	}
	
	public static int[] plusOne(int[] arr) {
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]<9) {
				arr[i]=arr[i]+1;
				return arr;
			}
			arr[i]=0;
		}
		
		int[] result=new int[arr.length+1];
		result[0]=1;
		
		
		return result;
		
	}

}
