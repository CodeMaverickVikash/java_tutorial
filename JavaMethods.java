/*
* Static method - A static method is a method that belongs to the class rather than to instances of the class. It can be called using the class name without creating an instance of the class.
* Key points about static methods:
* 1. They cannot access non-static (instance) variables or methods directly.
* 2. They can access static variables and other static methods directly.
* 3. They are associated with the class rather than with instances of the class.
* 4. They are often used for utility methods or operations that don't require an instance of the class.
*/

/*
 * Method overloading - It allows a class to have multiple methods with the same name but different parameter lists. The compiler determines which version of the method to invoke based on the number, types, and order of the method's parameters. 
 * Key points about method overloading:
 * Methods must have the same name.
 * Methods must be defined in the same class.
 * The parameter lists of overloaded methods must differ in terms of the number, types, or order of parameters.
 * Return types are not considered when overloading methods.
 * Note - Method overloading is a way to provide a clean and intuitive interface for different scenarios, allowing flexibility in how methods are used within a class.
 */

public class JavaMethods {
    // Driven Method
    public static void main(String[] args) {
        // c = logic(a, b);
        JavaMethods.staticMethod();

        // Creating instance of JavaMethods class
        JavaMethods instance = new JavaMethods();

        // Invoking different versions of the 'add' method
        log(instance.add(1, 2));
        log(instance.add(3, 4, 5));
        log(instance.add(2.5, 3.5));
    }

    public static <T> void log(T msg) {
        System.out.println(msg);
    }

    public static void staticMethod() {
        log("Static method can be called without object created");
    }

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}