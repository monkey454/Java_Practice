// Interface Program 
interface Animal {
    void makeSound(); // abstract method
    void eat();       // abstract method
    void run();       // abstract method
}
class Dog implements Animal {
    // Implementing the makeSound method
    public void makeSound() {
        System.out.println("Woof");
    }

    // Implementing the eat method
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void run() {
        System.out.println("Dog is running");
    }
}

class Cat implements Animal {
    // Implementing the makeSound method
    public void makeSound() {
        System.out.println("Meow");
    }

    // Implementing the eat method
    public void eat() {
        System.out.println("Cat is eating");
    }
    public void run() {
        System.out.println("Cat is running");
    }
}
public class Main3 {
    public static void main(String[] args) {
        // Object of Dog class
        Animal dog = new Dog();
       
         // Object of Cat class
        Animal cat = new Cat();
        cat.makeSound(); // Output: Meow
        cat.eat();       // Output: Cat is eating
    }
}
