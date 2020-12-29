import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("It is even.");
        }
        else
        {
            System.out.println("It is odd.");
        }
    }
}
