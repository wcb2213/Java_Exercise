package Java_Test;

import java.util.*;

public class TutorProgram {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		
		int correctNumber = 0;
		int lasterAnswer = 0;
		int answer = questionAnswer(console, rand);
		
		while (answer!=0) {
			correctNumber++;
			lasterAnswer = answer;
			answer = questionAnswer(console, rand);
		}
		System.out.println("You solved " + correctNumber + " correctly");
		if (correctNumber>0) {
			System.out.println("Last correct answer was " + lasterAnswer);
		}
	}
	
	private static int questionAnswer(Scanner console, Random rand) {
		int num1 = rand.nextInt(20)+1;
		int num2 = rand.nextInt(20)+1;
		System.out.print(num1+" * "+num2+" = ");
		int answer = console.nextInt();
		if (answer == num1*num2) {
			System.out.println("Correct!");
			return num1*num2;
		} else {
			System.out.printf("Incorrect; the correct number is %d\n", num1*num2);
			return 0;
		}
	}
}
