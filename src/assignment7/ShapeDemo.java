package assignment7;

public class MainShape {

	public static void main(String[] args) {
		Triangle triangle =new Triangle(5,10);
		Rectangle rectangle =new Rectangle(6,4);
		Circle circle = new Circle(3);
		
		System.out.println("Triangle area "+triangle.getArea());
		System.out.println("Rectangle area "+rectangle.getArea());
		System.out.println("Circle area "+circle.getArea());

	}

}
