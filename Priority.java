class Test extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}
public class Priority{
    public static void main(String[]args){
        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();

        obj1.setName("thread 1");
        obj2.setName("thread 2");
        obj3.setName("thread 3");

        obj1.setPriority(2);
        obj2.setPriority(5);
        obj3.setPriority(8);


        obj1.start();
        obj2.start();
        obj3.start();

    }
}