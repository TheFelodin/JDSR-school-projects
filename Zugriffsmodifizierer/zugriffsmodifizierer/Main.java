package zugriffsmodifizierer;

public class Main {

	public static void main(String[] args) {

		Bulb b1 = new Bulb(60, 10);
		LEDBulb lb1 = new LEDBulb(9, 10);
		
		System.out.println(b1);
		System.out.println(lb1);

	}

}
