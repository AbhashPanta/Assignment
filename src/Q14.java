import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Please enter 2nd number:");
        int num2 = sc.nextInt();


        if (num1 == num2)
        {
            System.out.println("They are both equal.");
        }
        else if (num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else
        {
            System.out.println(num2 + " is greater than " + num1);
        }

    }
}
