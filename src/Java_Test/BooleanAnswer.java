package Java_Test;

import java.util.*;

// 这种结构就很舒服
public class BooleanAnswer {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Type two words: "); // Type two words:
		String word1 = console.next(); // car
		String word2 = console.next(); // STAR
		
		if (rhyme(word1, word2)) {
			System.out.println("They rhyme!"); // They rhyme!
		}
		if (alliterate(word1, word2)) {
			System.out.println("They alliterate!");
		console.close();
		}
	}
	
	// Returns true if s1 and s2 end with the same two letters.
	private static boolean rhyme(String s1, String s2) {
		return s2.length() >= 2 && s1.endsWith(s2.substring(s2.length()-2));
	}
	
	// Returns true if s1 and s2 start with the same letter.
	private static boolean alliterate(String s1, String s2) {
		return s1.startsWith(s2.substring(0, 1));
	}
}
