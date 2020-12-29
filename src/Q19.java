import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first side:");
        int a = sc.nextInt();
        System.out.println("Please enter second side:");
        int b = sc.nextInt();
        System.out.println("Please enter third side:");
        int c = sc.nextInt();

        if (a == b && b == c)
        {
            System.out.println("It is an equilateral triangle.");
        }
        else
        {
            if (a == b || b == c || a == c)
            {
                System.out.println("It is an isosceles triangle.");
            }
            else
            {
                System.out.println("It is an scalar triangle.");
            }

        }
    }
}
