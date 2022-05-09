package DefaultPackage;

public class MoveZeroes {

	public static void main(String[] args) {
		int count=0;
	//	int[] nums = {0,5,7,0,8,0,9,3,2,0,1};
		int[] nums = {0,0,0,1};
		int length=nums.length;
	
		 for(int i=0; i<length-1; i++) {
	            if(nums[i]==0) {
	            	int index = i+1;
	            	while(nums[index]==0 && index<length-1) {
	            		index++;
	            	}
	            	nums[i] = nums[index];
	            	nums[index] = 0;
	            }
		 }

	            
	            for(int x:nums) 
	            	System.out.print(x+" ");
//		 
//		 for(int x:nums) 
//			 if(x!=0)
//			   System.out.print(x+" ");
//			 else 
//				 count++;
//		 
//		 for(int i=0; i<count; i++) {
//			 System.out.print("0"+" ");
//		 }
		
		 

}
}
