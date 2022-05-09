
public class PerfectNumber {
	
	public static void main(String[] args) {
		System.out.println(isPerfectNumber(8));
	}
	
	public static boolean isPerfectNumber(int num) {
		int sum=0, start;
		
		if(num<1)
			return false;
		
		for(start=1; start<num; start++) {
			if(num%start==0)
				sum+=start;
		}
		
		return num==sum ? true:false;
	}

}
