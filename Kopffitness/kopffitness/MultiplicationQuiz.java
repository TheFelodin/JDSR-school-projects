package kopffitness;

import java.util.Arrays;
import java.util.List;

public class MultiplicationQuiz {
	String exercise;
	int result;
	int number;
	 
	public int getRandomNumber() {
		number = (int)((Math.random()*20)+1);
		return number;
	}
	
	 public List<Object> getExercise() {
		 int multiplicator1 = getRandomNumber(); 
		 int multiplicator2 = getRandomNumber();
		exercise = (multiplicator1+" * "+multiplicator2+" = ?");
		result = getResult(multiplicator1, multiplicator2);
		return Arrays.asList(exercise, result);
	 }
	 public int getResult(int multiplicator1, int multiplicator2) {
		 int result = multiplicator1 * multiplicator2;
		 return result;
	 }
}
