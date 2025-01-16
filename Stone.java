import java.util.Scanner;
import java.util.Random;
public class Stone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1 = stone, 2 = paper, 3 = scissor, Now enter what you want to pick: ");
        int a = sc.nextInt();
        if (a==1){
            System.out.print("You have picked stone.");
        }
        if(a==2){
            System.out.print("You have picked paper.");
        }
        if(a==3){
            System.out.print("You have picked scissor.");
        }
        Random ran = new Random();
        int b = ran.nextInt(1,4);
//  " can use this also"
        if(b==1){
            System.out.print("PC has picked stone.");
        }
        else if(b==2){
            System.out.print("PC has picked Paper.");
        }
        else if(b==2){
            System.out.print("PC has picked scissor.");
        }
//  -----------------------------------
        switch(b){
            case 1:
            System.out.print("PC has picked stone.");
            break;
            case 2:
            System.out.print("PC has picked Paper.");
            break;
            case 3:
            System.out.print("PC has picked scissor.");
            break;
        }
        if(a==1 & b==1){
            System.out.print("The game is draw");
        }
        else if(a==1 & b==2){
            System.out.print("PC is the winner");
        }
        else if(a==1 & b==3){
            System.out.print("You are the winner");
        }
        else if(a==2 & b==1){
            System.out.print("PC the winner");
        }
        else if(a==2 & b==2){
            System.out.print("The game is draw");
        }
        else if(a==2 & b==3){
            System.out.print("PC is the winner");
        }
        else if(a==3 & b==1){
            System.out.print("PC is the winner");
        }
        else if(a==3 & b==2){
            System.out.print("You are the winner");
        }
        else if(a==3 & b==3){
            System.out.print("The game is draw");
        }
    }
}