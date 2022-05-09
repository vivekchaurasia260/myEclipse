
public class LargestPrime {
	
	public static void main(String[] args) {
		
		System.out.println(getLargestPrime(45));
	}

	public static int getLargestPrime(int number) {
		int itr;
		
		if(number<=1)
			return -1;
		
		for(itr=2; itr<Math.sqrt(number); itr++) {
			if((number%itr)==0) {
				number/=itr;
				itr--;
			}	
		}
		return number;
	}	
	
}
