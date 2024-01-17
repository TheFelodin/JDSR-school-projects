package MotorradBeispiel;

public class Reifen {

	// Attribute
	private double durchmesser;
	private double profiltiefe;
	private String jahreszeit;
	
	
	public Reifen(double durchmesser, double profiltiefe, String jahreszeit) {
		super();
		this.durchmesser = durchmesser;
		this.profiltiefe = profiltiefe;
		this.jahreszeit = jahreszeit;
	}

	// Ausgabe
	public void gibInfo() {
		System.out.println("Durchmesser: "+durchmesser);
		System.out.println("Profiltiefe: "+profiltiefe);
		System.out.println("Jahreszeit: "+jahreszeit);
	}
	
	public String toString() {
		return jahreszeit+"reifen mit "+ durchmesser + " cm Durchmesser und "+ profiltiefe + " Profiltiefe";
	}
	public double getDurchmesser() {
		return durchmesser;
	}
	public void setDurchmesser(double durchmesser) {
		this.durchmesser = durchmesser;
	}
	public double getProfiltiefe() {
		return profiltiefe;
	}
	public void setProfiltiefe(double profiltiefe) {
		this.profiltiefe = profiltiefe;
	}
	public String getJahreszeit() {
		return jahreszeit;
	}
	public void setJahreszeit(String jahreszeit) {
		this.jahreszeit = jahreszeit;
	}
	
	
}
