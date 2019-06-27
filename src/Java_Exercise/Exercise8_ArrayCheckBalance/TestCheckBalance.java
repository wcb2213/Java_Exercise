package Java_Exercise.Exercise8_ArrayCheckBalance;

import java.util.*;

/**
 * A TestCheckBalance class for assignment #8
 */
public class TestCheckBalance {

	// the expected answers from the user
	private static final String YES = "yes";
	private static final String NO  = "no";

	/**
	 * The main program
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Balance Checking Program");
		do {
			System.out.print("\nEnter the string you wish to check: ");
			String theString = input.nextLine();
			CheckBalance check = new CheckBalance(theString);
			if ( check.balanced() )
				System.out.println("The string is balanced!");
			else {
				System.out.println("The string is unbalanced:\n");
				System.out.println(theString);
				System.out.printf("%" + ( check.index() + 2 ) + "s", "^\n");
			}
			System.out.println();
		} while ( more(input) );
	}

	// Ask the user for more and return a boolean
	private static boolean more(Scanner input) {
		String answer;
		do {
			System.out.print("More? ");
			// trim will remove spaces at both ends of the string
			answer = input.nextLine().trim().toLowerCase();
		} while ( ! answer.equals(YES) && ! answer.equals(NO) );
		return answer.equals(YES);
	}
}
