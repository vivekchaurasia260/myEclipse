
public class FirstAndLastDigitSum {
	
	public static void main(String[] args) {
		
		System.out.println("The Sum of first and last digits are "+sumFirstAndLastDigit(73566621));
	}
	
public static int sumFirstAndLastDigit(int number) {
		
		if(number<0)
			return -1;
		
		int firstDigit=0;
		int lastDigit=number%10;	
		int copyNumber=number;

		while(copyNumber>0) {
			if(copyNumber/10==0) 
				firstDigit=copyNumber;
			
			copyNumber/=10;
		}
		
		return (firstDigit + lastDigit);
		
	}

}
