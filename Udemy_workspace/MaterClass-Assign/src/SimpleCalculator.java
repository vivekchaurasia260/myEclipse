
public class SimpleCalculator {
	 private double firstNumber, secondNumber;
		
		public double getFirstNumber() {
			
			return firstNumber;
		}
		public double getSecondNumber() {
			return secondNumber;
		}
		public void setFirstNumber(double firstNumber) {
			this.firstNumber=firstNumber;
		}
		public void setSecondNumber(double secondNumber) {
			this.secondNumber=secondNumber;
		}
		public double getAdditionResult() {
			return firstNumber + secondNumber;
		}
		public double getSubtractionResult() {
			return firstNumber - secondNumber;
		}
		public double getMultiplicationResult() {
			return firstNumber * secondNumber;
		}
		public double getDivisionResult() {
		    if(secondNumber==0.0)
		        return 0.0;
		        
			return firstNumber/secondNumber;
		}
	
	public static void main(String[] args) {
		
		SimpleCalculator sc=new SimpleCalculator();
		
		sc.setFirstNumber(5.0);
		sc.setSecondNumber(4.0);
		
	}	
	
}
