import java.util.Scanner;

public class Q43 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int a = sc.nextInt();
        System.out.println();

        System.out.println("Please enter number 2: ");
        int b = sc.nextInt();
        System.out.println();

        double result = 0;
        try
        {
            result = a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by 0 error occured. Cannot divide by 0.");
            e.printStackTrace();
        }
        finally {
            System.out.println("The result is: " + result);
        }

    }


}
