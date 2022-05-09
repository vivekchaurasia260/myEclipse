package DefaultPackage;
public class TestDemo1 {
	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int count=0, i=0;
		
		while(i<nums.length-1) {
			if(nums[i]==nums[i+1]) {
				for(int j=i+1; j<nums.length; j++) {
					nums[j-1]=nums[j];
				}
				count++;
			}
			else {
				i++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
