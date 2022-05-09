// In this I created a FeetAndInches --> Centimeters and Inches --> Feet. 

public class Overloading {

	public static void main(String[] args) {
		int newScore=calculateScore("Miller", 50);
		calculateScore(30);
		
		System.out.println("New score is "+newScore);
		
		double conversion = calcFeetAndInchesToCentimeters(0, 1);
		
		calcFeetAndInchesToCentimeters(100);
		
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+playerName+" scored "+score+" points");
		return score*1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player score "+score+" points");
		return score*1000;
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if(feet>=0 && (inches>=0 && inches<=12)) {	
			double centimeter = (feet*12) * 2.54;
			centimeter+=inches*2.54;
			
			System.out.println(feet+" Feet, "+inches+" Inches = "+centimeter+" cm");
			
			return centimeter;
		}
		else {
			System.out.println("Invalid parameters.....");
			return -1;
		}
			
	} 
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches>=0) {
			double feet =(int)inches/12;
			double remainingInches=(int)inches%12;
			System.out.println(inches+" Inches = "+feet+" feet and "+remainingInches+" remaining inches.");
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		}
		else {
			System.out.println("Invalid parameters.....");
			return -1;
		}
			
	}
}
