import java.util.Scanner;
class Odd_Even
{
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
      
        if(n%2==0)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.print("The number is Odd");
        }
    }
}