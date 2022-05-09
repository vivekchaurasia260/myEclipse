
public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		
		System.out.println("The Greatest Common divisior are "+getGreatestCommonDivisor(289,13));
	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		
		if(first<10 || second<10)
			return -1;
		else {
				int gcd=-1;
			for(int start=2; start<=(first>second ? first : second); start++) {
				if((first%start==0) && (second%start==0)) {
					gcd=start;
				}
					
			}
			
			return gcd;
		}
		
	}

}
