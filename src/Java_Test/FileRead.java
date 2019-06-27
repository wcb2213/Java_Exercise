package Java_Test;

import java.io.*;
import java.util.*;

/**
 * This class is to demonstrate how to read the content of a text file using Scanners
 */
public class FileRead {
	
	// you must put here the right file path
	private static String data_file = "C:\\Users\\WCB\\Desktop\\java\\JavaLesson\\part5\\rainfall.txt";

	public static void main(String[] args) throws FileNotFoundException {

			Scanner input_file = new Scanner(new File(data_file));

			System.out.println("end of reading");

			while ( input_file.hasNextLine() ) {

				String line = input_file.nextLine();
				Scanner input_line = new Scanner(line);

				while ( input_line.hasNext() ) {
					System.out.print(input_line.next() + " ");
				}
				System.out.println();

			}

			input_file.close();

			System.out.println("end of reading");
	}
}
