package week2;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape("kuning", false) {
			@Override
			double getParimeter() {
				// TODO Auto-generated method stub
				return 2.5;
			}
			
			@Override
			double getArea() {
				// TODO Auto-generated method stub
				return 4.5;
			}
		};
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Shape shape1 = new Rectangle();
		
//		Shape Object
		System.out.println("Shape before!");
		System.out.println(shape.getColor());
		System.out.println(shape.isFilled());
		System.out.println(shape.getArea());
		System.out.println(shape.getParimeter());
		shape.setColor("Green");
		shape.setFilled(false);
		System.out.println("Shape after with toString: " + "\n" + shape.toString());
		System.out.println();
		
//		Shape Object
		System.out.println("Shape1 before!");
		System.out.println(shape1.getColor());
		System.out.println(shape1.isFilled());
		System.out.println(shape1.getArea());
		System.out.println(shape1.getParimeter());
		shape1.setColor("Green");
		shape1.setFilled(false);
		System.out.println("Shape1 after with toString by rectangle: " + "\n" + shape1.toString());
		System.out.println();

//		Circle object
		System.out.println("Circle before!");
		System.out.println(circle.getArea());
		System.out.println(circle.getParimeter());
		System.out.println(circle.getColor());
		System.out.println(circle.isFilled());
		System.out.println(circle.getRadius());
		System.out.println("Circle after!");
		circle.setColor("Blue");
		circle.setFilled(false);
		circle.setRadius(3);
		System.out.println(circle.getColor());
		System.out.println(circle.isFilled());
		System.out.println(circle.getRadius());
		System.out.println("Circle toString: " + "\n" + circle.toString());
		System.out.println();
		
//		Rectangle
		System.out.println("Rectangle before!");
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getParimeter());
		System.out.println(rectangle.getColor());
		System.out.println(rectangle.isFilled());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getLength());
		System.out.println("Rectangle after!");
		rectangle.setColor("Yellow");
		rectangle.setFilled(false);
		rectangle.setWidth(3);
		rectangle.setLength(3);
		System.out.println(rectangle.getColor());
		System.out.println(rectangle.isFilled());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getLength());
		System.out.println("Rectangle toString: " + "\n" + rectangle.toString());
		System.out.println();
		
//		Square
		System.out.println("Square before!");
		System.out.println(square.getSide());
		square.setSide(4);
		System.out.println(square.getSide());
		square.setWidth(5);
		System.out.println(square.getWidth());
		square.setLength(5);
		System.out.println(square.getLength());
		System.out.println("Square toString: " + "\n" + square.toString());
	}
}
