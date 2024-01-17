package MotorradBeispiel;

public class Motorrad {

	// Attribute
	private Motor meinMotor;
	private Reifen[] meineReifen;
	
	// Konstruktor
	public Motorrad(Motor Motor, Reifen vorne, Reifen hinten) {
		super();
		this.meinMotor = Motor;
		
		meineReifen = new Reifen[2];
		meineReifen[0] = vorne;
		meineReifen[1] = hinten;
	}
	
	// Ausgabe
	public void gibInfo() {
		System.out.println("Motor:");
		meinMotor.gibInfo();
		System.out.println("Reifen");
		for (int i=0; i<meineReifen.length; i++) {
			meineReifen[i].gibInfo();
		}	
	}
	
	// Umwandlung in String
	public String toString() {
		return "Motorrad mit einem " +meinMotor+" und vorne einem "+getVorderreifen()+" und hinten einem "+getHinterreifen();
	}
	
	// setter und getter Methoden
	public Motor getMotor() {
		return meinMotor;
	}

	public void setMeinMotor(Motor meinMotor) {
		this.meinMotor = meinMotor;
	}

	public Reifen getVorderreifen() {
		return meineReifen[0];
	}

	public Reifen getHinterreifen() {
		return meineReifen[1];
	
	}
}