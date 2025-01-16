// java program to create a file
import java.io.*;
class File1
{
    public static void main(String[]args)
    {
        File f = new File("C:\\Users\\Durga\\Desktop\\Durga.txt");
        try
        {
            if(f.createNewFile())
            {
                System.out.println("File successfully created");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
         catch(IOException i)
        {
                System.out.println(i);
        }
    }
}