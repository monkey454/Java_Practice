import java.io.*;
public class Fileinfo
{
    public static void main(String[]args)
    {
        File f = new File("C:\\Users\\Durga\\Desktop\\Durga.txt");
        if(f.exists())
        {
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Writeable: "+f.canWrite());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Size in bytes: "+f.length());

        }
        else
        {
            System.out.println("File doesn't exist");
        }
    }
}