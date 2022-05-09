
public class Point {
	private int x, y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double distance() {
		double dis=Math.sqrt(Math.abs(((x*x)+(y*y))));
		return dis;
	}
	public double distance(int x, int y) {
		double dis=Math.abs(((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y)));
		dis=Math.sqrt(dis);
		return dis;
	}
	public double distance(Point p) {
		double dis=Math.abs(((p.getX()-this.x)*(p.getX()-this.x)+(p.getY()-this.y)*(p.getY()-this.y)));
		dis=Math.sqrt(dis);
		return dis;
	}
	public static void main(String[] args) {
		Point first=new Point(6,5);
		Point second=new Point(3,1);
		//System.out.println("COnstructor value "+first.getX()+" "+second.getY());
		System.out.println("Distance from (0,0) is "+first.distance());
		System.out.println("Distance from (second) is "+first.distance(second));
		System.out.println("Distance from (2,2) is "+first.distance(2,2));
		
		Point point=new Point();
		
		System.out.println("Point "+point.distance());
	}
}
