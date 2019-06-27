package Java_Exercise;

import java.util.Scanner;

/**
 * A class for assignment #3
 */
public class Exercise3_Admit2 {
	/**
	 * The main program
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		opening();
		double first = getOverallScore(scan,1);
		double second = getOverallScore(scan,2);
		double third = getOverallScore(scan,3);
		closing(first,second, third);
	}

	// Prints the opening message
	private static void opening() {
		System.out.println("This program computes and display the overall");
		System.out.println("score of three applicants.");
		System.out.println("For each applicant it will ask for SAT or");
		System.out.println("ACT scores plus a weighted GPA.\n");
	}

	// Prints the closing message.
	// 'first' is the overall score of the first applicant
	// 'second' is the overall score of the second applicant
	private static void closing(double first, double second, double third) {
		System.out.printf("%31s = %.2f\n", "First applicant overall score", first);
		System.out.printf("%31s = %.2f\n", "Second applicant overall score", second);
		System.out.printf("%31s = %.2f\n\n", "Third applicant overall score", third);
	}

	// Gets all necessary information, computes and returns
	// the overall score for an applicant.
	// 'scan' is the current Scanner and 'applicant' the number of the applicant
	private static double getOverallScore(Scanner scan, int applicant) {
		System.out.println("Information for applicant #" + applicant + ":");
		double exam = getExamScore(scan);
		System.out.printf("exam score = %.2f\n", exam);
		double gpa = getGPAscore(scan);
		System.out.printf("GPA score = %.2f\n", gpa);
		return exam + gpa;
	}

	// Gets all necessary information, computes and returns
	// the exam score (SAT or ACT).
	// 'scan' is the current Scanner
	private static double getExamScore(Scanner scan) {
		if ( isSAT(scan) )
			return getSATscore(scan);
		else
			return getACTscore(scan);
	}

	// Asks the applicant for SAT or ACT and returns
	// 1 for SAT or 2 for ACT.
	// The function prompts the applicant again if the
	// answer is neither 1 nor 2.
	private static boolean isSAT(Scanner scan) {
		int answer;
		do {
			System.out.print("do you have 1) SAT scores or 2) ACT scores? ");
			answer = scan.nextInt();
		} while ( answer != 1 && answer != 2 );
		return answer == 1;
	}

	// Gets all necessary information, computes and returns
	// the GPA score.
	// 'scan' is the current Scanner
	private static double getGPAscore(Scanner scan) {
		System.out.print("overall GPA? ");
		double actual_gpa = scan.nextDouble();
		System.out.print("max GPA? ");
		double max_gpa = scan.nextDouble();
		System.out.print("Transcript Multiplier? ");
		double transcript_multiplier = scan.nextDouble();
		return GPAscore(actual_gpa,max_gpa,transcript_multiplier);
	}

	// Gets all necessary information, computes and returns
	// the SAT score.
	// 'scan' is the current Scanner
	private static double getSATscore(Scanner scan) {
		System.out.print("SAT math? ");
		int math = scan.nextInt();
		System.out.print("SAT reading? ");
		int reading = scan.nextInt();
		System.out.print("SAT writing? ");
		int writing = scan.nextInt();
		return SATscore(math,reading,writing);
	}

	// Gets all necessary information, computes and returns
	// the ACT score.
	// 'scan' is the current Scanner
	private static double getACTscore(Scanner scan) {
		System.out.print("ACT English? ");
		int english = scan.nextInt();
		System.out.print("ACT math? ");
		int math = scan.nextInt();
		System.out.print("ACT reading? ");
		int reading = scan.nextInt();
		System.out.print("ACT science? ");
		int science = scan.nextInt();
		return ACTscore(english,math,reading,science);
	}

	// Computes and returns the SAT score from the given
	// 'math', 'reading' and 'writing' scores
	private static double SATscore(int math, int reading, int writing) {
		return ((double) 2 * math + reading + writing)/32;
	}

	// Computes and returns the ACT score from the given
	// 'english', 'math', 'reading' and 'science' scores
	private static double ACTscore(int english, int math, int reading, int science) {
		return (english + 2 * math + reading + science) / 1.8;
	}

	// Computes and returns the GPA score from the given
	// 'actual_gpa', 'max_gpa', and 'transcript_multiplier' values
	private static double GPAscore(double actual_gpa, double max_gpa, double transcript_multiplier) {
		return actual_gpa * 100 * transcript_multiplier / max_gpa;
	}
}
