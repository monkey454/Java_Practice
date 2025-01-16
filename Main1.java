// program of inheritance
class Animal {
    // Method in the superclass
    public void eat() {
        System.out.println("This animal eats food.");
    }

    // Method in the superclass
    public void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal {
    // Additional method in the subclass
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog myDog = new Dog();

        // Call methods from the superclass
        myDog.eat();    // Output: This animal eats food.
        myDog.sleep();  // Output: This animal sleeps.

        // Call method from the subclass
        myDog.bark();   // Output: The dog barks.
    }
}
