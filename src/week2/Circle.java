package week2;

public class Circle extends Shape {
	private double radius = 1.0;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	double getParimeter() {
		// TODO Auto-generated method stub
		return 3.5;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 3.5;
	}
	
	public String toString() {
		return "Color: " + this.color + "\nFilled: " + this.filled + "\nRadius: " + radius + " px";
	}
}
