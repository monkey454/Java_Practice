//Program to take name from the user and display it. 
import java.util.Scanner;
class Name{
    public static void main(String[]args)
    {
        Scanner nm = new Scanner(System.in);
        System.out.println("What is you name?");
        String name = nm.nextLine();
        System.out.println("Hello "+name+"! how are you?");

    }
}