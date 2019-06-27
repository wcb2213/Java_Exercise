package Java_Exercise;

import java.io.*;
import java.util.*;

/**
 * A class for assignment #6
 */
public class Exercise6_Personality {

	/**
	 * The main program
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		PrintStream output = new PrintStream(getFile(console,"output file name? "));
		Scanner input = new Scanner(getFile(console,"input file name? "));

		while ( input.hasNextLine() ) {
			String name = input.nextLine();
			String data = input.nextLine();
			output.println(getPersonalityOf(name,data));
		}

		output.close();
		input.close();
	}

	// process the person of name 'name' and of data 'data'
	// and return the result as "Betty Boop: [90, 15, 10, 10] = ISTJ"
	private static String getPersonalityOf(String name, String data) {
	    int[] numberOfA     = { 0, 0, 0, 0 };
	    int[] numberOfB     = { 0, 0, 0 ,0 };
	    int[] percentageOfB = { 0, 0, 0 ,0 };

	    countAB(data,numberOfA,numberOfB);
		computePercentage(numberOfA,numberOfB,percentageOfB);

		return name + ": "  + Arrays.toString(percentageOfB)
					+ " = " + getStringFrom(percentageOfB);
	}

	// update the arrays 'A' and 'B' by counting the
	// number of As and Bs in each dimension in line 'line'
	private static void countAB(String line, int[] A, int[] B) {
	    for ( int i = 0; i < line.length(); i++ ) {
	    	char c = line.charAt(i);
	    	int k = (i%7 + 1)/2;
		    if ( c == 'a' || c == 'A' )
		        A[k]++;
		    if ( c == 'b' || c == 'B' )
		        B[k]++;
	    }
	}

	// fill array 'percentageOfB' with the percentage of Bs
	// computed from the total number of As and Bs in each dimension
	// stored in the arrays 'numberOfA' and 'numberOfB'
	private static void computePercentage(int numberOfA[], int numberOfB[], int percentageOfB[]) {
		for ( int i = 0; i < percentageOfB.length; i++ )
			percentageOfB[i] =  (int) Math.round( numberOfB[i] * 100.0 / ( numberOfB[i] + numberOfA[i] ));
	}

	// return the personality string computed from
	// the percentage of Bs as 'ISTJ'
	private static String getStringFrom(int percentageOfB[]) {
		String personality = "";
		String profile[] = { "EXI", "SXN", "TXF", "JXP" };
		for ( int i = 0; i < percentageOfB.length; i++ )
	        personality += profile[i].charAt(choose_index(percentageOfB[i]));
	    return personality;
	}

	// return:
	//  * 0, if 'percentage' is less than 50
	//  * 1, if 'percentage' is equal to 50
	//  * 2, if 'percentage' is greater than 50
	private static int choose_index(int percentage){
		if ( percentage < 50 )
			return 0;
		if ( percentage > 50 )
			return 2;
		return 1;
	}

	// prompt the user with the string 'prompt'
	// read the path of a file and return the
	// related File object
	private static File getFile(Scanner console, String prompt) {
		String filepath;
		do {
			System.out.print(prompt);
			filepath = console.nextLine().trim();
		} while ( filepath.isEmpty() );
		return new File(filepath);
	}
}
