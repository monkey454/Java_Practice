// By implementing Runnable interface.
class Test implements Runnable{
    public void run()
    {
        for(int i=1;i<=5;i++){
            System.out.println("My child Thread");
        }
    }
}
public class Thread2{
    public static void main(String[]args)
    {
        Test obj = new Test();
        // Making object of Thread class because Runnable interface does not contain run() method and passing the reference parameter of Test class object.
        Thread obj1 = new Thread(obj);
        obj1.start();

        
        for(int i=1;i<=5;i++){
            System.out.println("main Thread");
        }
    }
}