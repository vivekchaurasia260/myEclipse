
public class ForLoop {
	public static void main(String[] args) {
		print(50);
	}
	
	
	public static boolean isPrime(int num) {
		
		if(num==1)
			return false;
		else {
			for(int itr=2; itr<=Math.sqrt(num); itr++) {
				if(num%itr==0)
					return false;
			}
			
			return true;
		}
	}
	
	public static void print(int num) {
		int count=0;
		for(int start=2; start<=num/2 ; start++) {
			if(isPrime(start)) {
				System.out.println(start+" is a prime number.");
				count++;
				if(count==6)
					break;
			}				
			else
				System.out.println(start+" is not a prime number.");
		}
	}

}
