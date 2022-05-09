class ComplexNumber {
	private double real, imaginary;
	
	public ComplexNumber(double real, double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public double getReal() 
	{
		return real;
	}
	public double getImaginary() {
		return imaginary;
	}
	public void add(double real, double imaginary) {
		this.real=this.real+real;
		this.imaginary=this.imaginary+imaginary;
	}
	public void add(ComplexNumber complexNumber) {
		add(complexNumber.real, complexNumber.imaginary);
	}
	public void subtract(double real, double imaginary) {
		this.real=this.real-real;
		this.imaginary=this.imaginary-imaginary;
	}
	public void subtract(ComplexNumber complexNumber) {
		subtract(complexNumber.real, complexNumber.imaginary);
	}
	
	public static void main(String[] args) {
		ComplexNumber one=new ComplexNumber(1.0, 1.0);
		ComplexNumber number=new ComplexNumber(2.5, -1.5);
		one.add(1,1);
		
		System.out.println("one.real= "+one.getReal());
		System.out.println("one.imaginary= "+one.getImaginary());
		one.subtract(number);
		
		
	}
}

