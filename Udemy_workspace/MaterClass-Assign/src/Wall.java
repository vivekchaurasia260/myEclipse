public class Wall {
	double width, height;
	public Wall() {
		
	}
	public Wall(double width, double height) {
		
		if(width>=0) 
			this.width=width;
		else
			this.width=width;
		if(height>=0)
			this.height=height;
		else
			this.height=0;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		if(width<0)
			this.width=0;
		else
			this.width=width;
	}
	public void setHeight(double height)  {
		if(height<0)
			this.height=0;
		else
			this.height=height;
	}
	
	public double getArea() {
		double area=width*height;
		return area;
	}
	
	public static void main(String[] args) {
		Wall wall=new Wall(-4.5, -2.0);
		System.out.println("Area= "+wall.getWidth());
		
		wall.setHeight(1.5);
		System.out.println("Wall "+wall.getHeight());
	}
}
