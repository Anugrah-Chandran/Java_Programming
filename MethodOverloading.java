package java_lab;

class Shape{
	public int area(int side) {
		System.out.println("Square");
		return side*side;
	}
	public int area(int l,int b) {
		System.out.println("Rectangle");
		return l*b;
	}
	public float area(float radius) {
		System.out.println("Circle");
		return 3.14f*(radius*radius);
	}
	
}
public class MethodOverloading {
	public static void main(String [] args) {
		Shape shape = new Shape();
		System.out.println(shape.area(10));
		System.out.println(shape.area(10,5));
		System.out.println(shape.area(3.14f));
		
	}

}
