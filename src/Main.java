import section_7_OOP1_Inheritance.Circle;
import section_7_OOP1_Inheritance.Cuboid;
import section_7_OOP1_Inheritance.Cylinder;
import section_7_OOP1_Inheritance.Rectangle;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello World\n".repeat(5).indent(25));

		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());

		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());

		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());

		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());
	}
}