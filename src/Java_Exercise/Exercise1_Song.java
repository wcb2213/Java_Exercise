package Java_Exercise;

/**
 * A class for assignment #1
 */
public class Exercise1_Song {
	/**
	 * The main program (i.e. the first function call by Java)
	 */
	public static void main(String[] args) {
		opening();
		verse_1();
		verse_2();
		verse_3();
		verse_4();
		verse_5();
		closing();
	}

	// Prints the opening verse
	private static void opening() {
		whoSwallowed("fly");
		suffix_0();
	}

	// Prints the closing verse
	private static void closing() {
		whoSwallowed("horse");
		System.out.println("She died of course.");
	}
	
	//// verse methods

	// Prints verse 1
	private static void verse_1() {
		whoSwallowed("spider");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		suffix_1();
	}

	// Prints verse 2
	private static void verse_2() {
		whoSwallowed("bird");
		System.out.println("How absurd to swallow a bird.");
		suffix_2();
	}

	// Prints verse 3
	private static void verse_3() {
		whoSwallowed("cat");
		System.out.println("Imagine that to swallow a cat.");
		suffix_3();
	}

	// Prints verse 4
	private static void verse_4() {
		whoSwallowed("dog");
		System.out.println("What a hog to swallow a dog.");
		suffix_4();
	}

	// Prints verse 5
	private static void verse_5() {
		whoSwallowed("cow");
		System.out.println("Swallow a cow, but how?");
		suffix_5();
	}

	//// suffix methods
	
	// Prints suffix 0 (at the end of all verses)
	private static void suffix_0() {
		System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.\n");
	}

	// Prints suffix 1 (at the end of verses 1 to 5)
	private static void suffix_1() {
		toCatch("spider","fly");
		suffix_0();
	}

	// Prints suffix 2 (at the end of verses 2 to 5)
	private static void suffix_2() {
		toCatch("bird","spider");
		suffix_1();
	}

	// Prints suffix 3 (at the end of verses 3 to 5)
	private static void suffix_3() {
		toCatch("cat","bird");
		suffix_2();
	}

	// Prints suffix 4 (at the end of verses 4 to 5)
	private static void suffix_4() {
		toCatch("dog","cat");
		suffix_3();
	}

	// Prints suffix 5 (at the end of verse 5)
	private static void suffix_5() {
		toCatch("cow","dog");
		suffix_4();
	}
	
	//// utility methods

	// To print the "who swallowed" sentences inside verses 1 to 5
	private static void whoSwallowed(String what) {
		System.out.println("There was an old woman who swallowed a " + what + ",");
	}

	// To print the "to catch the" sentences
	private static void toCatch(String first, String second) {
		System.out.println("She swallowed the " + first + " to catch the " + second + ",");
	}
}
