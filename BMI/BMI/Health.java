package BMI;

public class Health {
	double weight;
	double height;
	
	public static double calculateBMI(double weight, double height) {
		double bmi = weight/(height*height);
		return bmi;
	}
	
	public static String getCategory(double bmi) {
		String cat ="";
		if (bmi <18.5) {
			cat = "untergewichtig";
		} else if (bmi<= 25) {
			cat = "normalgewichtig";
		} else if (bmi<=30) {
			cat = "uebergewichtig";
		} else if (bmi > 30) {
			cat = "fettleibig";
		}
	return cat;
	}
}
