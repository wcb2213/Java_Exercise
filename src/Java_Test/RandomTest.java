package Java_Test;

import java.util.*;

public class RandomTest {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		double randomNumber = rand.nextInt(10)+rand.nextDouble();
		System.out.printf("The random number is %.4f", randomNumber);
	}
}
