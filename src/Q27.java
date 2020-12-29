import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = sc.nextInt();

        int numP = number;
        int numS = number;

        int product = 1;
        while (numP != 0) {
            System.out.print((numP % 10) + "*");
            product = product * (numP % 10);
            numP /= 10;
        }
        System.out.print("= " + product);
        System.out.println();

        int sum = 0;
        while (numS != 0)
        {
            System.out.print((numS % 10) + "+");
            sum = sum + (number % 10);
            numS /= 10;
        }
        System.out.print("= " + sum);
        System.out.println();
    }
}
