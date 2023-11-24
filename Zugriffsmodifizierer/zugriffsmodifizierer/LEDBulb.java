package zugriffsmodifizierer;

public class LEDBulb extends Lamp {

	// Konstruktor
	public LEDBulb(int watt, int hoursPerDay) {
		super(watt, hoursPerDay);
	}

	public String toString() {
		return "A led bulb consumes " + annualPowerConsumption() + " kWh per year.";
	}
	
}
