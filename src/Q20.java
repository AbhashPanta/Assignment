import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int a = sc.nextInt();
        System.out.println("Please enter second number:");
        int b = sc.nextInt();

        System.out.println("Please choose an operation(1-4): ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int option = sc.nextInt();


        switch(option)
        {
            case 1:
                System.out.println("Sum: " + addition(a,b));
            break;
            case 2:
                System.out.println("Difference: " + subtraction(a,b));
                break;
            case 3:
                System.out.println("Product: " + multiplication(a,b));
                break;
            case 4:
                System.out.println("Quotient: " + division(a,b));
                break;
        }
    }

    public static int addition(int a, int b)
    {
        return a+b;
    }
    public static int subtraction(int a, int b)
    {
        return a-b;
    }
    public static int multiplication(int a, int b)
    {
        return a*b;
    }
    public static double division(int a, int b)
    {
        return a/b;
    }


}
