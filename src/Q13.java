import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter eny number: ");
        double number = sc.nextDouble();

        if (number < 0)
        {
            System.out.println("The number you entered is: " + number);
        }

    }
}
