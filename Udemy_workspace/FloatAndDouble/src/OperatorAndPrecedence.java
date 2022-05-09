
public class OperatorAndPrecedence {
	public static void main(String[] args) {
		
		double myValue1=20.00d;
		double myValue2=80.00d;
		
		double addDouble= myValue1 + myValue2 * 100.00;
		
		double remValue = addDouble % 40.00d;
		
		System.out.println("The remainder "+remValue);
		
		boolean isRemainder = (remValue==0) ? true : false;
		
		System.out.println(isRemainder);
		
		if(!isRemainder) 
			System.out.println("Got Some remainder");	
		else
			System.out.println("Didn't got any remainder");
	}
}
