import java.net.*;
import java.io.*;

public class Main7 {
    public static void main(String[] args){
        try {
           
            
            // Define the URL to connect to
            URL url = new URL("http://www.pu.edu.np");

            // Open a connection to the URL using the proxy
            URLConnection connection = url.openConnection();

            // Read the content from the URL
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
