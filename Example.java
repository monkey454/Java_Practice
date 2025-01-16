public class Example {
    static int staticVar; // static variable

    public Example(int value) {
        staticVar = value;
    }

    public void display() {
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        Example obj1 = new Example(10);
        Example obj2 = new Example(20);

        obj1.display(); // prints: Static Variable: 20
        obj2.display(); // prints: Static Variable: 20

        System.out.println("Static Variable: " + Example.staticVar); // prints: Static Variable: 20
    }}