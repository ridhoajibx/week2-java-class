
public class Square extends Rectangle {
	public Square() {
		super();
	}
	
	public Square(double side) {
		this.width = side;
	}
	
	public Square(double side, String color, boolean filled) {
		this.width = side;
		this.color = color;
		this.filled = filled;
	}
	
	public double getSide() {
		return this.getWidth();
	}
	
	public void setSide(double side) {
		this.width = side;
	}
	
	public void setWidth(double side) {
		this.width = side;
	}
	
	public void setLength(double side) {
		this.length = side;
	}
	
	public String toString() {
		return "Color: " + this.color + "\nFilled: " + this.filled + "\nWidth: " + this.getWidth() + " cm" + "\nLength: " + this.getLength() + " cm";
	}
}
