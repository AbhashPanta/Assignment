import java.sql.SQLOutput;
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = sc.nextInt();

        int a = 0;
        for (int i = 1; i <= number; i++)
        {
            a = a + i/factorial(i);
        }

        System.out.println("Result = " + a);
    }


    public static int factorial(int a)
    {
        int product = 1;
        for(int i = 1; i <= a; i++)
        {
            product *= i;
        }

        return product;
    }

}
