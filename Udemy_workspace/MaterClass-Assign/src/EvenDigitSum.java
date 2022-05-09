
public class EvenDigitSum {
	public static void main(String[] args) {
		
		System.out.println("The even digit sum is "+getEvenDigitSum(-122));
		
	}
	public static int getEvenDigitSum(int number) {
		
		if(number<0)
			return -1;
		
		int digitSum=0;
		
		while(number!=0) {
			
			int rem=number%10;
			
			if(rem%2==0)
				digitSum+=rem;
			
			number/=10;
		}
		
		return digitSum;
	}

}

	
