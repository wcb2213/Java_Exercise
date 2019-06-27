package Java_Test;

//Displays each number in the given file,
//and displays their sum at the end.

import java.io.*; // for File
import java.util.*; // for Scanner

public class FileTest {
	
	public static void main(String[] args)	throws FileNotFoundException {
		Scanner input = new Scanner(new File("numbers.txt"));
		func1(input);
		func2(input);
		input.close();	
	}
	
	// answer 2
	private static void func1(Scanner input) {
		double sum = 0.0;
		while (input.hasNextDouble()) {
			double next = input.nextDouble();
			System.out.println("number = " + next);
			sum = sum + next;
		}
		System.out.printf("Sum = %.1f\n", sum);
	}
	
	// answer 3
	private static void func2(Scanner input) {
		double sum = 0.0;
		while (input.hasNext()) {
			if (input.hasNextDouble()) {
				double next = input.nextDouble();
				System.out.println("number = " + next);
				sum = sum + next;
			} else {
				input.next(); // throw away the bad token
			}
		}
		System.out.printf("Sum = %.1f\n", sum);
	}	
}
