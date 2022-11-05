package studio7;

public class Complex {

	private double a;
	private double b;
	private String whole;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
		this.whole = this.a + " + " + this.b + 'i';
	}
	
	public static String sum(Complex one, Complex two) {
		double a = one.a + two.a;
		double b = one.b + two.b;
		return a + " + " + b + 'i';
	}
	
	public static String multiply(Complex one, Complex two) {
		double a = (one.a*two.a) - (one.b*two.b);
		double b = (one.a*two.b) + (one.b*two.a);
		return a + " + " + b + 'i';
	}
	
	public static void main(String[] args) {
		Complex one = new Complex(5, 6);
		Complex two = new Complex(2, 10);
		System.out.println(sum(one, two));

	}

}
