/*
 * Inheritance - Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class to inherit properties and behaviors from another class. In Java, you can achieve inheritance using the extends keyword.
 */

class CommonUtil {
    public static <T> void log(T msg) {
        System.out.println(msg);
    }
}

// Base class (superclass)
class Animal {
	String name;

	// Constructor
	public Animal(String name) {
		this.name = name;
	}

	// Method
	public void eat() {
		CommonUtil.log(name + " is eating.");
	}
}

// Derived class (subclass)
class Dog extends Animal {
	// Additional field
	String breed;

	// Constructor
	public Dog(String name, String breed) {
		// Call the superclass constructor
		super(name);
		this.breed = breed;
	}

	// Additional method
	public void bark() {
		CommonUtil.log(name + " is barking. Woof!");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		// Create an instance of the subclass
		Dog myDog = new Dog("Buddy", "Golden Retriever");

		// Call methods from both the superclass and the subclass
		myDog.eat(); // Inherited method from Animal class
		myDog.bark(); // Method specific to Dog class
	}
}
