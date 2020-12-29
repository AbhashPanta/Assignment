import java.awt.*;
import java.sql.SQLOutput;
import java.util.Formatter;
import java.util.Scanner;

public class Q12_PrintInfo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.next();

        System.out.println("Please enter your roll:");
        int roll = sc.nextInt();

        System.out.println("Please enter your nationality:");
        String nationality = sc.next();

        Formatter f = new Formatter();
        System.out.println(f.format("%3d | %10s | %10s",roll,name,nationality));





    }
}
