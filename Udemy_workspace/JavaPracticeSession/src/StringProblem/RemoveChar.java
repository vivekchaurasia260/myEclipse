package StringProblem;

public class RemoveChar {

	public static void main(String[] args) {
		
		String str="GeekskforGkeeks";
		
		char ch='k';
		
		System.out.println("Original String is " + str);
		
		System.out.println("The result String is " +removeCharacter(str, ch));
		
	}
	
	public static String removeCharacter(String str, char ch) {
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==ch) {
				
				str=str.substring(0, i)+str.substring(i+1);
				break;
				
			}
			
		}
		
		for(int i=str.length()-1; i>=0; i--) {
					
			if(str.charAt(i)==ch) {
				
				str=str.substring(0, i)+str.substring(i+1);
				break;
				
			}
			
		}
		
		return str;
		
	}

}
