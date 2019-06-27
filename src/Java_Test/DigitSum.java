package Java_Test;

import java.util.*;

public class DigitSum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		digitSum(scan);
	}
	
	private static void digitSum(Scanner scan) {
		// print
		int num = scan.nextInt();
		while(num<0) {
			// print	
			num = scan.nextInt();
		}
		System.out.println(digit(num));
	}
	
	private static int digit(int num) {
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
}
