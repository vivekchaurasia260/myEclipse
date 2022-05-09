package DefaultPackage;

// Product of array except itself
public class ArrayProduct {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,0};
		int len=arr.length;
		
		int result[] =productOfArray(arr, len);
		
		for(int x:result) 
			System.out.print(x+" ");
		
	}
	
	public static int[] productOfArray(int[] arr, int length) {
		
		int i, j, prod;
		
		int[] result = new int[length];
		
		for(i=0; i<length; i++) {
			prod=1;
			for(j=0; j<length; j++) {
				if(i!=j) {
					prod *=arr[j];
				}
			}
			result[i]=prod;
		}
		
		return result;
		
	}

}
