
public class NumberPallindrome {
	
	public static void main(String[] args) {
		
		String result=isPalindrome(-222) ? "It is a pallindrome":"It is not a pallindrome";
		System.out.println(result);
	}
	
	public static boolean isPalindrome(int number) {
		
		number=Math.abs(number);
		int rev=0;
		int copyParameter=number;
		while(copyParameter>0) {
			int rem=copyParameter%10;
			rev=(rev*10)+rem;
			copyParameter/=10;
		}
		
	//	int revNum = Integer.parseInt(rev);
		
		if(rev==number)
			return true;
		
		return false;
		
	}
	
}
