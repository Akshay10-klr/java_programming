package inheritancepack;

class Shape {
	void display() {
		System.out.println("Calculating Area");
	}
}

class Rectangle extends Shape {
	void rectangleArea() {
		System.out.println("Area of Rectangle = " + (4 * 4));
	}
}

class Square extends Rectangle {
	void squareArea() {
		System.out.println("Area of Square = " + (5 * 5));
	}
}

class Circle extends Shape {
	void circleArea() {
		System.out.println("Area of Circle = " + (3.14 * 5 * 5));
	}
}

public class HybridInheritance {

	public static void main(String[] args) {

		Square square = new Square();
		square.display();
		square.rectangleArea();
		square.squareArea();

		Circle circle = new Circle();
		circle.display();
		circle.circleArea();
	}
}