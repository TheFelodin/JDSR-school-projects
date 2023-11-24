package personen;

public class Person{
	// protected in private geändert, weil Kunde nie auf name
	// direkt zugreift. Der Name von Kunde wird in Person gespeichert.
	private String name;
	
	public Person() {
		name = "N.N.";
	}
	
	public Person( String n ) {
		name = n;
	}
	
	public String toString() {
		return "Name: " + name;
	}
}
