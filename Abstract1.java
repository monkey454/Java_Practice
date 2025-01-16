// program of abstract class implementation
abstract class Animal1{
    // Abstract method
    abstract void makeSound();
    // Regular method
    void sleep(){
        System.out.println("Zzzz....");
    }
}
//Inherited class from Animal1 
class Dog extends Animal1{
    // Body of makeSound() method is provided here
    void makeSound()
    {
        System.out.println("Woof Woof");
    }
}
public class Abstract1{
    public static void main(String[]args){
        // creating a dog object of Dog class
        Dog dog = new Dog();
        // calling the abstract method
        dog.makeSound();
        dog.sleep();
     }
}