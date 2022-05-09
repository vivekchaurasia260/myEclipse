
public class NumberToWord {
	public static void main(String[] args) {
		
		numberToWords(0);
	}
	
	public static void numberToWords(int number) {
		
		int reverse=reverse(number);
		int digits=getDigitCount(number);
		
		//System.out.println("Digits "+digits);
		if(reverse<0)
			System.out.println("Invalid Value");
		else {
				while(digits-- > 0)
				{					
					int rem=reverse%10;
					
					switch(rem) {
			
					case 0:
						System.out.println("Zero");
						break;
					case 1:
						System.out.println("One");
						break;
					case 2:
						System.out.println("Two");
						break;
					case 3:
						System.out.println("Three");
						break;
					case 4:
						System.out.println("Four");
						break;
					case 5:
						System.out.println("Five");
						break;
					case 6:
						System.out.println("Six");
						break;
					case 7:
						System.out.println("Seven");
						break;
					case 8:
						System.out.println("Eight");
						break;
					case 9:
						System.out.println("Nine");
						break;
					}
					reverse/=10;
				}
		}
	}
	
	public static int reverse(int number) {
		int rev=0;
		
			while(number!=0) {
				int rem=number%10;
				rev=(rev*10) + rem;
				number/=10;
			}
			return rev;
	}
	
	public static int getDigitCount(int number) {
		int count=0;
		
		if(number==0)
			return 1;
		
		if(number<0)
			return -1;
		else {
			while(number!=0) {
				count++;
				number/=10;
			}
			return count;
		}
		
	}
}
