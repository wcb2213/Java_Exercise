package Java_Exercise.Exercise7_Point;

public class Point {
	
	private int x;
	private int y;
	
	private static int z = 0;
	
	public Point(int xx, int yy) {
		x = xx;
		y = yy;
		z++;
	}
	
	public Point() {
		x = 0;
		y = 0;
		z++;
	}	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public double distance() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double distance(Point p) {
		double dx = x - p.x;
		double dy = y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public static int getZ() {
		return z;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}


