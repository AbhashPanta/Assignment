import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = sc.nextInt();

        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("The number in reverse: " + reverse);

    }
}
