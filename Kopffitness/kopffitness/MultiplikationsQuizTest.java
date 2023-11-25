package kopffitness;

import java.util.List;
import java.util.Scanner; // Import the Scanner class

public class MultiplikationsQuizTest {

	public static void main(String[] args) {
		MultiplicationQuiz mq = new MultiplicationQuiz();
		List<Object> exercise = mq.getExercise();
		Scanner input = new Scanner(System.in);
		System.out.println(exercise.get(0));
		int input_result = input.nextInt();
		if (input_result == (int)(exercise.get(1))) {
			System.out.println(exercise.get(1)+" ist Richtig!");
		} else {
			System.out.println("Falsch! Die richtige Lösung ist: "+exercise.get(1));
		}
		input.close();
	}

}
