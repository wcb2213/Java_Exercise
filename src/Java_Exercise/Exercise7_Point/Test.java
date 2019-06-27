package Java_Exercise.Exercise7_Point;

public class Test {

	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
		NamedPoint p2 = new NamedPoint("A",2,3);
		System.out.println(p2.getName());
		//p1.x = 0;
		
		System.out.println(p1);
		//Point.z = 10;
		System.out.println("p2 = " + p2);
		
		double d1 = p2.distance();
		double d2 = p1.distance(p2); // p2.distance(p1);
		System.out.println(d1);
		System.out.println(d2);
	}
}
