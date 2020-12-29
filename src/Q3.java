import java.io.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = sc.nextInt();

        System.out.println("Enter the second number:");
        int second = sc.nextInt();

        int sum = first + second;
        double average = (first + second) / 2;

        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The average of the two numbers is: " + average);

    }
}
