package Java_Test;

import java.util.*;

public class CaesarCipher {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Your secret message: ");
//		String s = "TIEI is a great institute!";
		String s = console.nextLine();
		
		System.out.print("Your secret key: ");
//		int size = 3;
		int size = console.nextInt();
		
		console.close();
		
		thansform(s.toLowerCase(),size);
	}
	private static void thansform(String s, int size) {
		for (int i=0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (letter>='a' && letter<='z') {
				letter = (char) (letter+size);
				if (letter > 'z') {
					letter = (char) (letter-26);
				}else if (letter < 'a') {
					letter = (char) (letter+26);
				}
			}
			System.out.print(letter);
		}
		System.out.println();
	}
}
