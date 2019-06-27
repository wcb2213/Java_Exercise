package Java_Exercise.Exercise8_ArrayCheckBalance;

import java.util.*;

/**
 * A CheckBalance class for assignment #8
 */
public class CheckBalance {

	// the opening characters
	private static final String OPENINGS = "{([<";
	// the (matching) closing characters
	private static final String CLOSINGS = "})]>";

	// the string to check
	private String input;
	// the index in the input string after we return from balanced
	private int index;
	// to know if the string is balanced
	private boolean balanced;

	/**
	 * Build a new CheckBalance balance object
	 * to check if the string input is balanced
	 */
	public CheckBalance(String input) {
		this.input = input;
		balanced = checkBalanced();
	}

	/**
	 * Return true if the input string is balanced
	 * false otherwise
	 */
	public boolean balanced() {
		return balanced;
	}

	/**
	 * Return the index in the input string
	 * where the balanced method stopped
	 */
	public int index() {
		return index;
	}

	/**
	 * Return true if the input string is balanced
	 * false otherwise
	 */
	private boolean checkBalanced() {
		// ArrayStack stack = new ArrayStack();
		Stack<Character> stack = new Stack<>();
		for ( index = 0; index < input.length(); index++ ) {
			char c = input.charAt( index );
			if ( isOpening(c) )
				stack.push(c);
			else if ( isClosing(c) )
				if ( stack.isEmpty() || dontMatch(stack.pop(),c) )
					return false;
		}
		return stack.isEmpty();
	}

	/**
	 * Return true is c is an opening character
	 * false otherwise
	 */
	private boolean isOpening(char c) {
		return OPENINGS.indexOf(c) > -1;
	}

	/**
	 * Return true is c is a closing character
	 * false otherwise
	 */
	private boolean isClosing(char c) {
		return CLOSINGS.indexOf(c) > -1;
	}

	/**
	 * Return true if opening character 'o' and the
	 * closing character 'c' DON'T match
	 */
	private boolean dontMatch(char o, char c) {
		return OPENINGS.indexOf(o) != CLOSINGS.indexOf(c);
	}
}
