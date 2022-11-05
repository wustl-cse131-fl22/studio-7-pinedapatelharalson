package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public static String sum(Fraction a, Fraction b) {
		int newNumerator;
		int newDenom;
		if (a.denominator == b.denominator) {
			newNumerator = a.numerator + b.numerator;
			newDenom = a.denominator;
		}
		else {
			newDenom = a.denominator * b.denominator;
			newNumerator = (a.numerator * b.denominator) +(b.numerator * a.denominator);
		}
		if (newDenom < 0) {
			newDenom *= -1;
			newNumerator *= -1;
		}
		
		return newNumerator + "/" + newDenom;
	}
	
	public static String multiply(Fraction a, Fraction b) {
		int newNumerator = a.numerator * b.numerator;
		int newDenom = a.denominator * b.denominator;
		if (newDenom < 0) {
			newDenom *= -1;
			newNumerator *= -1;
		}		
		return newNumerator + "/" + newDenom;
	}
	
	public static String reciprocal(Fraction a) {
		int newNumerator = a.denominator;
		int newDenom = a.numerator;
		if (newDenom < 0) {
			newDenom *= -1;
			newNumerator *= -1;
		}
		return newNumerator + "/" + newDenom;
	}
	
	public static String simplify(Fraction a) {
		int gcd = gcd(a.numerator, a.denominator);
		int newNumerator = a.numerator/gcd;
		int newDenom = a.denominator/gcd;
		if (newDenom < 0) {
			newDenom *= -1;
			newNumerator *= -1;
		}
		return newNumerator + "/" + newDenom;
	}
	
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	
	public static void main(String[] args) {
		Fraction one = new Fraction(9, 3);
		Fraction two = new Fraction (3, 9);
		Fraction three = new Fraction (-2, 4);
		Fraction four = new Fraction(4, -2);
		System.out.println(multiply(one, four));
	}

}
