package section_7_oop1_inheritance;

public class Cylinder extends Circle{

	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height < 0 ? 0 : height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return getArea() * height;
	}
}
