// Exception handling using try and catch method.
class Exp
{
    public static void main(String[]args)
    {
        System.out.println("Main Thread started here");
        int a=2,b=0,c;
        // try block contains the risky code and passes the exception to the catch block if any exception occurs.
        try
        {
            c=a/b;
            System.out.println(c);
        }
        // catch block catches the exception passed by the try block and handles it.
        catch(Exception e)
        {
            System.out.println(e);
        }
        // finally block is used to handle the resources.
        finally
        {
            System.out.println("Realtime Block");
        }
        System.out.println("Main Thread ended here");
    }
}