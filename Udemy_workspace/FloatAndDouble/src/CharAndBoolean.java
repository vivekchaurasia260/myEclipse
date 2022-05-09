
public class CharAndBoolean {

	public static void main(String[] args) {
		//This is a unicode value which uses 2 bytes of memory.
		
		char myChar = 'D';
		char myUnicodeChar = '\u0064';
		
		System.out.println(myChar);
		System.out.println(myUnicodeChar);
		
		String myString = "10";
		double doubleNumber = 34.22d;
		
		String lastString = doubleNumber + myString;
		
		System.out.println("The last string is "+lastString);
		
		// If I'm using assignment operator in if condition
		int newValue = 50;
		
		boolean isCar=false;
		
		// Here, we didn't get error because equals operator returns boolean value...and we are assigning boolean value in if statement.
		if(isCar=true) {
			System.out.println("This is line will execute without error.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
