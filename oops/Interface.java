/*
 * Interface - It is a collection of abstract methods. It defines a contract that implementing classes must adhere to by providing concrete implementations for those methods. 
 * In addition to abstract methods, an interface can also include constant fields, default methods, and static methods. 
 * We can't create object of interface.
 */

public class Interface {
	public static void main(String[] args) {
		// Create an instance of the Circle class
		Circle circle = new Circle(5.0);

		// Call methods defined in the interface
		double area = circle.calculateArea();
		double perimeter = circle.calculatePerimeter();

		// Call default method from the interface
		circle.displayInfo();

		// Call static method from the interface
		Shape.printStaticInfo();

		// Display results
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}

// Interface definition
interface Shape {
	// Abstract method (implicitly public and abstract)
	double calculateArea();

	// Another abstract method
	double calculatePerimeter();

	// Constant field (implicitly public, static, and final)
	String DESCRIPTION = "This is a shape.";

	// Default method with a body
	default void displayInfo() {
		System.out.println(DESCRIPTION);
	}

	// Static method (can be called on the interface itself)
	static void printStaticInfo() {
		System.out.println("This is a static method in the Shape interface.");
	}
}

// Class implementing the Shape interface
class Circle implements Shape {
	private double radius;

	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Implementation of calculateArea method
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	// Implementation of calculatePerimeter method
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}