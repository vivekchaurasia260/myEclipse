package DefaultPackage;

import java.util.HashMap;
import java.util.Map;

public class DistinctElement {

	public static void main(String[] args) {
		boolean flag;
		int i, j;
		int[] arr= {1,2,3,4,2,5,1,3,2,1,1,3,2,4};
		
		for(i=0; i<arr.length-1; i++) {
			flag=true;
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j] && (arr[i]!=0 || arr[j]!=0)) {
					arr[j]=0;
					flag=false;
				}
			}
			if(flag==false)
				arr[i]=0;
		}
		
		for(int x:arr) {
			if(x!=0)
				System.out.print(x+" ");
		}

	}

}
