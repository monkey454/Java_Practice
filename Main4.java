// Interface Inheritance Program and problem of Multiple Inheritance is solved here.
interface Animal {
    void makeSound(); // abstract method
}
interface Dog extends Animal {
    void eat(); // abstract method
}
class Test implements Dog{
    public void makeSound() {
        System.out.println("Woof");}
    public void eat() {
        System.out.println("Dog is eating");}
}

public class Main4{
    public static void main(String[] args) {
        
        // Object of Test class
        Test dog = new Test();
        dog.makeSound(); // Output: Woof
        dog.eat();       // Output: Dog is eating
    }
}
