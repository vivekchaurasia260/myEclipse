
public class EqualSumChecker {
	
	public static void main(String[] args) {
		System.out.println(hasEqualSum(5,7,12));
	}
	
	public static boolean hasEqualSum(int input1, int input2, int input3) {
		
		if((input1+input2)==input3)
			return true;
		else
			return false;
		
	}

}
 