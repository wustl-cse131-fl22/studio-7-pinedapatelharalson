package studio7;

public class Rectangle {

	private double length;
	private double width;
	private double area;
	private boolean isSquare = false;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.area = length*width;
		if (length == width) {
			this.isSquare = true;
		}
	}
	
	//indicate if smaller than another in terms of area
	public static boolean isSmaller(Rectangle r, Rectangle s) {
		boolean isSmaller = false;
		if (r.area < s.area) {
			isSmaller = true;
		}
		return isSmaller;
	}
	
	public String toString() {
		return "Length: " + this.length + ", Width: " + this.width + ", Area: " + this.area;
	}
	
	public static void main(String [] args) {
		Rectangle one = new Rectangle(1, 6);
		Rectangle two = new Rectangle(12, 5);
		//checks if smaller
		System.out.println(two.isSmaller(two, one));
		
		//checks if square
		System.out.println(one.isSquare);
	}
}
