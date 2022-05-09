package StringProblem;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String [] arr = {"geeksforgeeks", "geeks", "geek",
		         "geezer"};

		
		if(arr.length==0)
			return;
		
		String prefix=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			while(arr[i].indexOf(prefix) !=0) {
				
				prefix = prefix.substring(0, prefix.length()-1);
				
			}
			
		}
		
		
		System.out.println("The Longest common prefix is " + prefix);
		
		
	
		
		
	}

}
