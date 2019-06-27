package Java_Exercise.Exercise7_Point;

public class NamedPoint extends Point {
	
	private String name;
	
	public NamedPoint(String n, int x, int y) {
		super(x,y); // 执行父类的构造函数
		name = n;
	}
	
	public NamedPoint() {
		super();
		name = "O";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		// return name + "(" + getX() + ", " + getY()+ ")";
		return name + super.toString();
	}

}
