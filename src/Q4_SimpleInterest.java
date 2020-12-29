import java.io.*;
import java.util.Scanner;

public class Q4_SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();
        System.out.println();

        System.out.print("Enter the time in number of years: ");
        int time = sc.nextInt();
        System.out.println();

        System.out.println("Enter the interest rate: ");
        double rate = sc.nextDouble();
        System.out.println();

        double simpleInterest = (principal*time*rate)/100;
        System.out.println("The simple interest is " + simpleInterest + "per year");
    }
}
