package Java_Test;

import java.io.*; // for File
import java.util.*; // for Scanner

public class TokenizingLines {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("hours.txt"));
		Scanner console = new Scanner(System.in);
		input(console, input);
		console.close();
	}
	// input
	private static void input(Scanner console, Scanner input) {
		System.out.print("Enter an ID: ");
		int searchId = console.nextInt(); // e.g. 456
		
		String line = findPerson(input, searchId);
		if (line.length() > 0) {
			processLine(line);
		} else {
			System.out.println("ID #" + searchId + " was not found");
		}
	}
	// Locates and returns the line of data about a particular person.
	private static String findPerson(Scanner input, int searchId) {
		while (input.hasNextLine()) {
			String line = input.nextLine();
			Scanner lineScan = new Scanner(line);
			int id = lineScan.nextInt(); // e.g. 456
			if (id == searchId) {
				lineScan.close();
				return line; // we found them!
			}
		}
		return ""; // not found, so return an empty line
	}
	// Totals the hours worked by the person and outputs their info.
	private static void processLine(String line) {
		Scanner lineScan = new Scanner(line);
		int id = lineScan.nextInt(); // e.g. 456
		String name = lineScan.next(); // e.g. "Brad"
		double hours = 0.0;
		int days = 0;
		while (lineScan.hasNextDouble()) {
			hours += lineScan.nextDouble();
		days++;
		}
		lineScan.close();
		System.out.println(name + " worked " + hours + " hours ("
		+ (hours / days) + " hours/day)");
	}
}

