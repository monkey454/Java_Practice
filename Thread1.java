// By extending Threads
// From line 2 to 19 we have defined the thread. 
class Test extends Thread
{
    // run() method is a method in Thread class
    public void run()
    {
        // Here we have used try and catch method for exception handling
        try{
            for(int i=1;i<=5;i++)
        {
            System.out.println("Durga");
            Thread.sleep(1000);
        }

        }
        catch(InterruptedException i)
        {

        }
    }
}
public class Thread1
{
    // Here main thread will handle the exception itself.
    public static void main(String[]args) throws InterruptedException 
    {
        Test obj = new Test();
        // start() method will start the thread and will internally run the run() method.
        obj.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Nitesh");
            // sleep() is a method of Thread class which pauses the execution of the current thread for a specified period of time.
            Thread.sleep(1000);
        }
    }
}