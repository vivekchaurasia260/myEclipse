
public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 13));
	}
	
	public static boolean hasSharedDigit(int num1, int num2) {
		
		if((num1<10 || num2>99) || (num1>99 || num2<10)) 
			return false;
		
		int rem1, rem2, copyNum2;
		while(num1!=0) {
			rem1 = num1%10;
			//copyNum2=num2;
			
			while(num2!=0) {
				
				if(rem1==(num2%10)) {
					return true;
				}
				
				num2/=10;
			}
			num1/=10;
		}
		
		return false;
		
	}
	
}
