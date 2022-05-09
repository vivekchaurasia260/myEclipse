package DefaultPackage;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr = {};
		int val = scan.nextInt();
		
		int res=removeElement(arr, val);
		
		for(int i=0; i<res; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int removeElement(int[] arr, int val) {
		
		int len=arr.length;
		int index=0, next;
		while(index<len) {
			int element=arr[index];
			
			if(element==val) {
				for(next=index; next<len-1; next++) {
					arr[next]=arr[next+1];
				}
				len=len-1;
			}
			else {
				index++;
			}
		}
		return index;	
	}
}

//  0,1,2,2,3,0,4,2
