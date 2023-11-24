package vererbung;

public class VererbungsTest {

	public static void main(String[] args) {
		Kunde einKunde = new Kunde();
		Kunde nochEinKunde = new Kunde("Fritz", 100);
		System.out.println(einKunde);
		System.out.println(nochEinKunde);
	}
}
