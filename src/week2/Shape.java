package week2;

public abstract class Shape {
	protected String color = "red";
	protected boolean filled = true;
		
	public Shape() {
		super();
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	abstract double getArea();
	abstract double getParimeter();
	
	public String toString() {
        return "Color: " + color + "\nFilled: " + filled;
    }
}
