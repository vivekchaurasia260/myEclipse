
public class SecondAndMinuteChallenge {

	public static void main(String[] args) {
		
		getDurationString(3945);
		
	}
	
	
	public static String getDurationString(long minutes, long seconds) {
		
		if(minutes>=0 || (seconds>=0 && seconds<=59)) {
			long hours = minutes/60;
			
			//minutes-=(hours*60);
			
			minutes%=60;
			
			
			System.out.println(hours+" Hour "+minutes+" minutes "+seconds+" seconds");
			
			return hours+" hours "+minutes+" min "+seconds+" sec" ;
			
		}	
		else {
			return "Invalid Value";
		}
	}
	
	public static String getDurationString(long seconds) {
		
		if(seconds>=0) {
			long minutes = seconds/60;
			long remainingMin=seconds%60;
			
			System.out.println(minutes+" minutes "+remainingMin+" seconds");		
			
			return getDurationString(minutes, remainingMin);
			
		}
		else
			return "Invalid parameter.";
	}
}
