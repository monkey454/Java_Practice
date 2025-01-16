// program to calculate marks of a student obtained in five subjects.
import java.util.Scanner;
public class Result{
    public static void main(String[] args){
        Scanner subject = new Scanner(System.in);
        System.out.println("Enter the marks of English");
        float subject1 = subject.nextFloat();
        System.out.println("Enter the marks of Nepali");
        float subject2 = subject.nextFloat();
        System.out.println("Enter the marks of Social");
        float subject3= subject.nextFloat();
        System.out.println("Enter the marks of Science");
        float subject4 = subject.nextFloat();
        System.out.println("Enter the marks of Maths");
        float subject5 = subject.nextFloat();
        float marks = subject1+subject2+subject3+subject4+subject5;
        System.out.println("Total Marks obtained are: ");
        System.out.println(marks);
        float totalMarks = 500;
        float percent = (marks*100)/totalMarks;
        System.out.println("Total percentage obtained: "+ percent+"%");
    }
}
// Things I would like to add in this: 
// Marks of one should not be out of 100 and program will display wrong  input and return to the respective subject input code.

