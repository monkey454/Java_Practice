class Test extends Thread{
    public void run(){
        // currentThread)() method will define which is the current thread and getName() method will get the name which we had set using setName() method.
        // The currentThread() method returns a reference to the currently executing thread object.
        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
    }
    public class Join{
        public static void main(String[]args){
            Test obj1 = new Test();
            Test obj2 = new Test();
            Test obj3 = new Test();
    
            obj1.setName("thread 1");
            obj2.setName("thread 2");
            obj3.setName("thread 3");
    
            obj2.start();
            try
            {
                // join() method is used to finish the particular thread completely whenever the given thread will be executed.
                obj2.join();
            }
            catch(InterruptedException i)
            {

            }
        
            obj1.start();
            obj3.start();
    
        }
    }
    