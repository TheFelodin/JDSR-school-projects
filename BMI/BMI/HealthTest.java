package BMI;

import java.util.Scanner; // Import the Scanner class

public class HealthTest {

	public static void main(String[] args) {
		Scanner input_hight = new Scanner(System.in);
		System.out.println("Enter hight in m: ");
		double hight = input_hight.nextDouble();

		Scanner input_weight = new Scanner(System.in);
		System.out.println("Enter weight in kg: ");
		double weight = input_weight.nextDouble();
		input_weight.close();
		input_hight.close();

		double bmi = Health.calculateBMI(weight, hight);

		System.out.println("Mit einem BMI von " + bmi + " sind Sie " + Health.getCategory(bmi) + ".");

	}

}
