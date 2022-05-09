
public class AllFactors {
	public static void main(String[] args) {
		printFactors(32);
	}
	
	public static void printFactors(int num) {
		
		if(num<1)
			System.out.println("Invalid Value");
		else {
			for(int start=1; start<=num; start++) {
				if(num%start==0)
					System.out.println(start);
			}
			
		}
	}

}
