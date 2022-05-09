package DefaultPackage;

public class UncrossedLines {
	
	public static void main(String[] args) {
		
		int[] A = {2,5,1,2,5};
		int[] B = {10,5,2,1,5,2};
		
		int result = maxUncrossedLines(A, B);
		
		System.out.println(result);
		
	}	
	 public static int maxUncrossedLines(int[] A, int[] B) {
	        int count=0;
	        
	        if(A.length<B.length)
	        	return maxUncrossedLines(B, A);
	        
	        System.out.println("A length "+A.length);
	        System.out.println("B length "+B.length);
	        
	        for(int i=0; i<A.length-1 && i<B.length-1; i++) {
	            
	            if(A[i]==B[i]) {
	                count++;
	            }
	            if((A[i]==B[i+1]) || A[i+1]==B[i]){
	                count++;
	            }
	            
	        }
	        
	        return count;
	        
}
}
