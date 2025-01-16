import java.io.*;
public class Rename
{
    public static void main(String[]args)
    {
       File f = new File("C:\\Users\\Durga\\Desktop\\Durga1.txt");
       File r = new File("C:\\Users\\Durga\\Desktop\\DurgaPandey.txt");
         
       if(f.exists())
       {
        System.out.println(f.renameTo(r));
        System.out.println("File successfully renamed");
       }
       else
       {
        System.out.println("File doesn't exists");
       }
      }
}   