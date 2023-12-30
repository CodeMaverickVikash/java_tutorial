
/*
 * Abstract class - It is a class that cannot be instantiated on its own and is typically used as a base class for other classes. Abstract classes can have abstract methods (methods without a body) that must be implemented by concrete (non-abstract) subclasses.
 * We can't create object of abstract class
 */

class CommonUtil {
    public static <T> void log(T msg) {
        System.out.println(msg);
    }
}

abstract class Animal {
	// Abstract method (to be implemented by subclasses)
	public abstract void animal_sound();

	// Concrete method
	public void Hello() {
		CommonUtil.log("Hello animal lover - abstract concrete method");
	}
}

class Cat extends Animal {
	// We are changing base class method in Superclass that is called method
	// overriding.
	@Override
	public void animal_sound() {
		CommonUtil.log("Meow - override by Cat");
	}
}

class Dog extends Animal {
	@Override
	public void animal_sound() {
		CommonUtil.log("Bow Bow - override by Dog");
	}
}

public class Abstract {
	public static void main(String[] args) {
		Cat catInstance = new Cat();
		Dog dogInstance = new Dog();

		catInstance.Hello();
		catInstance.animal_sound();
		dogInstance.Hello();
		dogInstance.animal_sound();
	}
}