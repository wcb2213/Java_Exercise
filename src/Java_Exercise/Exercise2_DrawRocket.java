package Java_Exercise;

/**
 * A class for assignment #2
 */
public class Exercise2_DrawRocket {
	
	// the size of the rocket
	private static final int size = 5;

	/**
	 * The main program
	 */
	public static void main(String[] args) {
		headTail();
		separator();
		bigArrowUp();
		bigArrowDown();
		separator();
		bigArrowDown();
		bigArrowUp();
		separator();
		headTail();
	}

	// Prints the head/tail of the rocket
	private static void headTail() {
		for ( int line = 1; line <= 2*size - 1; line++ ) {
			headTailLine(line);
		}
	}

	// Prints one line of the head/tail of the rocket.
	// 'slashes' is the number of slashes in the line.
	// For example, 'headTailLine(4)' with a size of 3
	// will print out:  '  ////**\\\\'
	private static void headTailLine(int slashes) {
		repeatString(" ",2*size - slashes);
		repeatString("/",slashes);
		System.out.print("**");
		repeatString("\\",slashes);
		System.out.println();
	}

	// Prints a separating line of the rocket
	private static void separator() {
		System.out.print('+');
		repeatString("=*",2*size);
		System.out.println('+');
	}

	// Prints the big double arrow up of the rocket.
	private static void bigArrowUp() {
		for ( int dots = size - 1; dots >= 0; dots-- ) {
			bigArrowLine(dots,"/\\");
		}
	}

	// Prints the big double arrow down of the rocket.
	private static void bigArrowDown() {
		for ( int dots = 0; dots <= size - 1; dots++ ) {
			bigArrowLine(dots,"\\/");
		}
	}

	// Prints one line of the big double arrow up/down
	// of the rocket, with 'dots' dots on the left and
	// right, and 2 x 'dots' in the center. For example
	// 'line(1,"/\\")' with a size of 3 will print out
	// '|./\/\../\/\.|'
	private static void bigArrowLine(int dots, String arrow) {
		System.out.print('|');
		for (int i = 0; i < 2; i++ ) {
			repeatString(".",dots);
			repeatString(arrow,size - dots);
			repeatString(".",dots);
		}
		System.out.println('|');
	}

	// Prints the string 's' 'n' times in a row
	private static void repeatString(String s, int n) {
		for ( int i = 0; i < n; i++ )
			System.out.print(s);
	}
}
