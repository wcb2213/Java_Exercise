package Java_Exercise.Exercise8_ArrayCheckBalance;

/**
 * An ArrayStack class for assignment #8
 */
public class ArrayStack {

	// the maximum size of the stack
	private int CAPACITY = 1024;

	// the array hosting the stack
	private char[] array;
	// the number of characters currently in the stack
	private int size;

	/**
	 * Return an empty stack
	 */
	public ArrayStack() {
		array = new char[CAPACITY];
		size = 0;
	}

	/**
	 * Return an empty stack
	 */
	public ArrayStack(int capacity) {
		CAPACITY = capacity;
		array = new char[CAPACITY];
		size = 0;
	}


	/**
	 * Push the character 'c' onto the stack
	 */
	public void push(char c) {
		// array[size++] = c;
		array[size] = c;
		size = size + 1;
	}

	/**
	 * Return the next chracter to be popped
	 * from the stack
	 */
	public char peek() {
		try {
			return array[size - 1];
		}
		catch ( Exception e ) {
			return 0;
		}
	}

	/**
	 * Pop the stack and return the character
	 * popped
	 */
	public char pop() {
		// return array[--size];
		size = size - 1;
		return array[size];
	}

	/**
	 * Check if the stack is empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}
}
