package Java_Exercise.Exercise9_IntegerQueue;

import java.util.*;

/**
 * A Sieve class for assignment #9
 */
public class Sieve {

	// number of primes per line
	private static final int PRIMES_PER_LINE = 12;
	// the last value of max computeTo was called with
	private int n;
	// the latest queue of primes computed
	private IntegerQueue primes;
	// private Queue<Integer> primes;

	/**
	 * Buid a Sieve object
	 */
	public Sieve() {
		n = 0;
		// primes = new LinkedList<Integer>();
		primes = new IntegerQueue();
	}

	/**
	 * Compute the prime numbers from 2 to max inclusive
	 */
	public void computeTo(int max) {
		if ( max < 2 )
			throw new IllegalArgumentException();
		this.n = max;
		primes.clear();
		// Queue<Integer> tmp = new LinkedList<Integer>();
		IntegerQueue tmp = new IntegerQueue();
		for ( int i = 2; i <= n; i++ )
			tmp.offer(i);
		int p;
		do {
			p = tmp.poll();
			primes.offer(p);
			removeDivisible(tmp,p);
		} while ( p < Math.sqrt(n) );
		while ( ! tmp.isEmpty() )
			primes.offer(tmp.poll());
	}

	// Remove all the numbers in q which are multiple of p
	// private void removeDivisible(Queue<Integer> q, int p) {
	private void removeDivisible(IntegerQueue q, int p) {
		int size = q.size();
		for ( int i = 0; i < size; i++ ) {
			int value = q.poll();
			if ( value % p != 0 )
				q.offer(value);
		}
	}

	/**
	 * Print the prime numbers
	 */
	public void reportResults() {
		if ( n < 2 )
			throw new IllegalStateException();
		System.out.print("Primes up to " + n + " are as follows:");
		int size = primes.size();
		for ( int i = 0; i < size; i++ ) {
			if ( i % PRIMES_PER_LINE == 0 )
				System.out.println();
			int prime = primes.poll();
			System.out.print(prime + " ");
			primes.offer(prime);
		}
		System.out.println();
	}

	/**
	 * Return the last value computeTo was called with
	 */
	public int getMax() {
		if ( n < 2 )
			throw new IllegalStateException();
		return n;
	}

	/**
	 * Return the number of prime numbers computed
	 * by the last call to computeTo
	 */
	public int getCount() {
		if ( n < 2 )
			throw new IllegalStateException();
		return primes.size();
	}
}
