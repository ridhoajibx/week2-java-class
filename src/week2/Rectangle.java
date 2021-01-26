
public class Rectangle extends Shape {
	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 4.5;
	}

	@Override
	double getParimeter() {
		// TODO Auto-generated method stub
		return 4.5;
	}
	
	public String toString() {
		return "Color: " + this.color + "\nFilled: " + this.filled + "\nWidth: " + width + " cm" + "\nLength: " + length + " cm";
	}
}
