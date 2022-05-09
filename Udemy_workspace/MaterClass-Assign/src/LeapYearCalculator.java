
public class LeapYearCalculator {
	
	public static void main(String[] args) {
	
		String result = isLeapYear(2020) ? "It is Leap year" : "It is not a Leap year.";
		
		System.out.println(result);
		
	}
	
	public static boolean isLeapYear(int year) {
		
		if(year>=1 && year <=9999) {
			if(year%4==0)
			{
				if(year%100==0) 
				{
					if(year%400==0)
						return true;
					else
						return false;
				}
				else
					return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public static int getDaysInMonth(int month, int year) {
		
		if((month<1 && month>12) || (year<1 && year>9999))
			return -1;
		
		return 0;
	}
}
