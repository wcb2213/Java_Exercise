package Java_Test;

public class MirrorCode {
	private static final int SIZE = 4;
	
	public static void main(String[] args) {
	top();
	bottom();
	}
	
	private static void top() {
		line();
		for (int i=1; i<=SIZE; i++) {
			System.out.print("|");
			for (int space=SIZE-i; space>=1; space--) {
				System.out.print("  ");
			}
			System.out.print("<>");
			for (int dot=1; dot<i; dot++) {
				System.out.print("....");
			}
			System.out.print("<>");
			for (int space=SIZE-i; space>=1; space--) {
				System.out.print("  ");
			}
			System.out.println("|");
		}
	}
	private static void bottom() {
		for (int i=1; i<=SIZE; i++) {
			System.out.print("|");
			for (int space=1; space<i; space++) {
				System.out.print("  ");
			}
			System.out.print("<>");
			for (int dot=1; dot<=SIZE-i; dot++) {
				System.out.print("....");
			}
			System.out.print("<>");
			for (int space=1; space<i; space++) {
				System.out.print("  ");
			}
			System.out.println("|");
		}
		line();
	}
	private static void line() {
		System.out.print("#");
		for (int i=1; i<=SIZE; i++) {
			System.out.print("====");
		}
		System.out.println("#");
	}
}	
