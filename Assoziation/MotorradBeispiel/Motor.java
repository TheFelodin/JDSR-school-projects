package MotorradBeispiel;

public class Motor {
	private int leistung;
	private double hubraum;
	
	// Konstruktor
	public Motor(int leistung, double hubraum) {
		super();
		this.leistung = leistung;
		this.hubraum = hubraum;
	}
	// Ausgabe
	public void gibInfo() {
		System.out.println("Leistung: "+leistung);
		System.out.println("Hubraum: "+hubraum);
	}
	// Umwandlung in String
	public String toString() {
		return "Motor mit " + leistung + " PS und " + hubraum + " Liter Hubraum";
	}
	// get-Methoden
	public int getLeistung() {
		return leistung;
	}
	public double getHubraum() {
		return hubraum;
	}
	
	// set-MEthoden
	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	public void setHubraum(double hubraum) {
		this.hubraum = hubraum;
	}
	
	
}
