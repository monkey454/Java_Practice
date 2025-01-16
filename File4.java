import java.io.*;
public class File4
{
    public static void main(String[]args) throws IOException
    {

            FileInputStream r = new FileInputStream("C:\\Users\\Durga\\Desktop\\DurgaPandey.txt");
            FileOutputStream w = new FileOutputStream("C:\\Users\\Durga\\Desktop\\DP.txt");
            
                int i;
                while((i=r.read())!=-1)
                {
                    w.write((char)i);
                }
          System.out.println("Data Successfully copied"); 
    }
} 