package studio7;

public class Die {

	private int numOfSides;
	
	public Die(int n) {
		this.numOfSides = n;
	}
	
	public static int dieRoll(int n) {
		return (int)(Math.random()*n)+1;
	}
	
	public String toString() {
		return "" + numOfSides;
	}
	
	public static void main(String[] args) {
		Die five = new Die(5);
		Die twenty = new Die(20);
		System.out.println(five.dieRoll(five.numOfSides));
	}

}
