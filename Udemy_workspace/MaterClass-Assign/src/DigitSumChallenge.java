
public class DigitSumChallenge {
	public static void main(String[] args) {
	
		System.out.println("The sum of digits are: "+sumDigits(325));
	}
	
	public static int sumDigits(int number) {
		int sum=0;
		
		if(number<10)
			return -1;
		
		while(number>0) {
			int rem=number%10;
			sum+=rem;
			number/=10;
		}
		
			return sum;
	}
}
