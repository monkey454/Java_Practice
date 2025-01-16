import java.io.*;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        try (FileOutputStream fos = new FileOutputStream("employee.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
             
            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for employee " + (i + 1));
                
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Mobile: ");
                String mobile = scanner.nextLine();
                
                System.out.print("Address: ");
                String address = scanner.nextLine();
                
                // Write the information to the file
                oos.writeUTF(name);
                oos.writeUTF(mobile);
                oos.writeUTF(address);
            }
            
            System.out.println("Employee information saved to employee.dat");
            
        } catch (IOException e) {
      
        }
    }
}
