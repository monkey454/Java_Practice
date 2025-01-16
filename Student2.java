import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Student.txt"))) {
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Age: " + age);
            writer.newLine();
            writer.write("ID: " + id);
            writer.newLine();
            
            System.out.println("Student information saved to Student.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
