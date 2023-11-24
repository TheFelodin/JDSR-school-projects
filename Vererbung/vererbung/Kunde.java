package vererbung;

public class Kunde extends Person {
	private int kundenID;

	public Kunde() {
		// Der Default-Konstruktor von Person und Object wird auch
		// ohne super() aufgerufen
		// super();
		kundenID = 0;
	}

	public Kunde(String n, int id) {
		// Der Parameter-Konstruktor muss explizit aufgerufen werden
		// Dieser ruft auch die Default-Konstruktoren von Person und
		// Object auf
		super(n);
		kundenID = id;
	}

	public String toString() {
		return super.toString() + "\nKundenID: " + kundenID;
	}
}
