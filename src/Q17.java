import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year = sc.nextInt();

        if (year % 4 == 0)
        {
            System.out.println("It is a leap year.");
        }
        else
        {
            System.out.println("It is not a leap year.");
        }

    }
}
