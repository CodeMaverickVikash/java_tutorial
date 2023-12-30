public class Oops {
    public static void main(String[] args) {
        Employee vikash = new Employee(12, 34000, "Vikash"); // Instantiating a new Employee Object
        Employee john = new Employee(17, 12000, "John"); // Instantiating a new Employee Object

        // Printing the Attributes
        vikash.printDetails();
        john.printDetails();

        System.out.println(john.getSalary());
    }
}


/****************************************
 * Classes and Object
 ***************************************/

// Custom Class and Constructors
class Employee {
    int id;
    int salary;
    String name;

    Employee(int eId, int eSalary, String eName) {
        this.id = eId;
        this.salary = eSalary;
        this.name = eName;
    }

    public void printDetails() {
        System.out.println("Myself " + name);
        System.out.println("id of " + name + " is " + id);
        System.out.println();
    }

    public int getSalary() {
        return salary;
    }
}

/**********************************************
 * Access modifiers in Java
 *****************************************/

/*
 * Access modifiers are keywords that specify the visibility or accessibility of classes, methods, and fields within a program. There are four main access modifiers in Java:
 * 1. Default - 1. If no access modifier is specified, the default access level is package-private.
                2. The element is accessible only within its own package.
 * 2. public - 1. The element (class, method, or field) is accessible from any other class.
               2. There is no restriction on access.
 * 3. private - 1. The element is accessible only within its own class.
                2. It is not accessible from outside the class, including subclasses.
 * 4. protected - 1. The element is accessible within its own package and by subclasses, even if they are in a different package.
                  2. Subclasses outside the package can access the protected members only through inheritance.
 */

/********************************************
 * this and super keyword in Java
 **************************************/

/*
 * The this keyword refers to the current object/class in a method or
 * constructor.
 * The super keyword refers to superclass (parent) objects.
 */