package Java_Exercise.Exercise9_IntegerQueue;

/**
 * An IntegerQueue class for assignment #9
 */
public class IntegerQueue {

	// the head of the list (where elements come out)
	private LinkedNode head;
	// the tail of the list (where elements come in)
	private LinkedNode tail;
	// the size of the queue
	private int size;

	/**
	 * Build an empty queue
	 */
	public IntegerQueue() {
		head = tail = null;
		size = 0;
	}

	/**
	 * Reset the queue (i.e. remove all
	 * elements in the queue)
	 */
	public void clear() {
		head = tail = null;
		size = 0;
	}

	/**
	 * Check if the queue is empty
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Return the size of the queue
	 * (i.e. the number of elements currently in the queue)
	 */
	public int size() {
		return size;
	}

	/**
	 * Add the new integer 'n' in the queue
	 */
	public void offer(int n) {
		if ( head == null ) {
			head = new LinkedNode(n);
			tail = head;
		}
		else {
			tail.next = new LinkedNode(n);
			tail = tail.next;
		}
		size++;
	}

	/**
	 * Remove and return the next element to be
	 * removed from the queue if the queue is not
	 * empty, do nothing and return 0 otherwise
	 */
	public int poll() {
		int n = 0;
		if ( head != null ) {
			n = head.data;
			head = head.next;
			if ( head == null )
				tail = null;
			size--;
		}
		return n;
	}

	// Private inner class for linked list node
	private class LinkedNode {

		// the data in the node
		public int data;
		// the link to the next node
		public LinkedNode next;

		// Build a new linked node with
		// the 'data' value as the data
		public LinkedNode(int data) {
			this.data = data;
			next = null;
		}
	}
}
