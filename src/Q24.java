import java.util.Scanner;

public class Q24 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = sc.nextInt();

        int product = 1;
        for(int i = 1; i <= a; i++)
        {
            product *= i;
        }

        System.out.println("The factorial of " + a + " is " + product);
    }
}
