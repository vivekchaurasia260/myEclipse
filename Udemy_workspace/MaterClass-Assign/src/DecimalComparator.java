
public class DecimalComparator {
	
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(3.7345, 3.74457));
	}	
	
	public static boolean areEqualByThreeDecimalPlaces(double firstVal, double secondVal) {
		
		if((int) (firstVal * 1000) == (int) (secondVal*1000))
			return true;
		else 
			return false;	
	}
}
