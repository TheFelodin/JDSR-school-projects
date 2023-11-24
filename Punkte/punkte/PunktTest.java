package punkte;

public class PunktTest {

	public static void main(String[] args) {
		Punkt punktEins = new Punkt();
		Punkt punktZwei = new Punkt();
		
		punktEins.setX(1);
		punktEins.setY(2);
		
		System.out.println( "P("
				+ punktEins.getX()
				+ "|"
				+ punktEins.getY()
				+ ")" );
		
		punktZwei.setX(3);
		punktZwei.setY(4);
		
		System.out.println( "Q("
				+ punktZwei.getX()
				+ "|"
				+ punktZwei.getY()
				+ ")" );

	}

}
