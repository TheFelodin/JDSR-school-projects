package zugriffsmodifizierer;

public class Lamp {

	// Attribute
	private int watt;
	private int hoursPerDay;

	// Konstruktor
	public Lamp(int watt, int hoursPerDay) {
		this.watt = watt;
		this.hoursPerDay = hoursPerDay;
	}

	// Methoden
	public int annualPowerConsumption() {
		return (watt * hoursPerDay * 365) / 1000;
	}

}
