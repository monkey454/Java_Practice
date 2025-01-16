interface Human{
    void run();
    void sleep();
    void awake();
}
class Person implements Human{
    public void run(){
        System.out.println("The person is running");
    }
    public void sleep(){
        System.out.println("The person is sleeping");
    }
    public void awake(){
        System.out.println("The person is awake");
    }


}
public class Main5{
    public static void main(String[]args){
        Human person = new Person();
        person.run();
        person.sleep();
        person.awake();
    }
}

