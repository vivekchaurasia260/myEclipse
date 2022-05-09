
public class MinutesToYearsAndDays {
	public static void main(String[] args) {
		
		printYearsAndDays(0);
		
	}
	
	public static void printYearsAndDays(long minutes) {
		
		if(minutes<0)
			System.out.println("Invalid Value");
		else {
			long year=minutes/(60*24*365);
			long days=minutes%(60*24*365);
			days/=1440;
			
			long hour=minutes%24;
			
			System.out.println(year+"Y "+days+"D "+hour+"H");
		}
	}

}
