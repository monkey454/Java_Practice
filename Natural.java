import java.util.Scanner;
class Natural{
    public static void main(String[]args)
    {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the value as you require:");
      int n = scn.nextInt();
      for(int x=1;x<=n;x++)
      {
        System.out.print(x+" ");
      }
    }
}