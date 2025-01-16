import java.io.*;
public class File2
{
    public static void main(String[]args)
    {
        try
        {
            FileWriter f = new FileWriter("C:\\Users\\Durga\\Desktop\\Durga1.txt");
            try
            {
                f.write("Java is the best Programming language");
            }
            finally
            {
                f.close();
            }
        System.out.println("Successfully data wrote in the file");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}   