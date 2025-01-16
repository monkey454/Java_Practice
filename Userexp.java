class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
public class Userexp{
    public static void main(String[]args)
    {
        try
        {
            vote(12);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void vote(int age) throws InvalidAgeException
    {
        if (age<18) 
        {
            throw new InvalidAgeException("Not eligible to vote");
        }
        else
        {
            System.out.println("You are eligible for voting");
        }
    }
}
