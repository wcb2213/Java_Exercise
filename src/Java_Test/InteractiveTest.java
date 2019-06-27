package Java_Test;

import java.util.*;

public class InteractiveTest {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		func1(console);
		func2(console);
	}
	
	private static void func1(Scanner console) {
		System.out.print("print a number ");
		int num = console.nextInt(); // 直到读取一个int为止
		console.close();
		
//		System.out.println("You print " + num);
		int result = (int)Math.pow(num, 2);
		System.out.println("The number's sqar is " + result);
	}
	private static void func2(Scanner console) {
		System.out.print("How old are you? ");
		if (console.hasNextInt()) {
			int age = console.nextInt(); // will not crash!
			System.out.println("Wow, " + age + " is old!");
		} else {
			System.out.println("You didn't type an integer.");
		}
	}
}
