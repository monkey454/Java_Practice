class A extends Thread
{
    public void run(){
      int a;
      for(a=1;a<=20;a++)
      if(a%2==0)
      System.out.println(a);
}
}
class B implements Runnable{
    public void run()
    {
        int b;
        try
        {
            for(b=1;b<=40;b++)
            {
            if(b%2==1)
            System.out.println(b);
            Thread.sleep(1000);
            }
        }
        catch(Exception e){

        }

    }
}
public class Exam{
    public static void main(String[]args){
        A thread1 = new A();
        B thread2 = new B(); 
        Thread b = new Thread(thread2);

        thread1.start();
        b.start();
    
    }
}

