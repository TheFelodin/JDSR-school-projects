package brueche;

public class BruchTest {

	public static void main(String[] args) {
		Bruch.gemischterBruch = true;
		Bruch bruchEins = new Bruch(3, 4);
		Bruch bruchZwei = new Bruch(14, -6);
		System.out.print(bruchEins + " * " + bruchZwei + " = ");
		bruchEins.multipliziereMit(bruchZwei);
		System.out.println();
		System.out.println("bruchEins: " + bruchEins);
		System.out.println("bruchZwei: " + bruchZwei);
		System.out.print(bruchEins + " * " + bruchZwei + " = ");
		System.out.println();
		Bruch bruchDrei = Bruch.multipliziereMit(bruchEins, bruchZwei);
		System.out.println("bruchDrei: " + bruchDrei);
	}

}
