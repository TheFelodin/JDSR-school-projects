public class Bulb extends Lamp {

	// Konstruktor
	public Bulb(int watt, int hoursPerDay) {
		super(watt, hoursPerDay);
	}
	
	public String toString() {
		return "A bulb consumes " + annualPowerConsumption() + " kWh per year."; 
	}

}
