
public class DiagonalStar {
	
	public static void main(String[] args) {
		printSquareStar(8);
	}
	
	public static void printSquareStar(int number) {
		
//		if(number<5)
//			System.out.println("Invalid Value");
//		
//		for(int i=0; i<number; i++) {
//			for(int j=0; j<number; j++) {
//				if((i==1 && j==2) || (i==2 && j==1) || (i==2 && j==3) || (i==3 && j==2))
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//		} 
		
		
		 String X = "";
		 
	        if (number < 5) {
	            System.out.println("Invalid Value");
	 
	        } else {
	 
	            for (int i = 1; i <= number; i++) {
	 
	                for (int y = 1; y <= number; y++) {
	 
	                    if ((i == 1 || i == number) || (y == 1 || y == number) 
	                            || (i == y) || (y == number - i + 1)) {
	                        X += "*";
	                    } else {
	                        X += " ";
	                    }
	 
	                }
	                System.out.println(X);
	                X = "";
	 
	            }
	}
	}
}
