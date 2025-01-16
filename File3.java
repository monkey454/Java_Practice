import java.io.*;
public class File3
{
    public static void main(String[]args)
    {
        try
        {
            FileReader f = new FileReader("C:\\Users\\Durga\\Desktop\\Durga1.txt");
            try
            {
                int i;
                while((i=f.read())!=-1)
                {
                    System.out.print((char)i);
                }
            }
            finally
            {
                f.close();
                System.out.println("Successfully closed");
            }
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}   