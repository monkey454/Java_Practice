// Program to convert kilometers in miles.
import java.util.Scanner;
class convert{
    public static void main(String[]args)
    {
        System.out.println("Enter the kilometers:");
        Scanner cn = new Scanner(System.in);
        float km = cn.nextFloat();
        float mile = 0.621371f;
        float miles = km*mile;
        System.out.println("The value in miles is: "+miles);

    }
    
}