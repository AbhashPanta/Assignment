import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int a = sc.nextInt();


        int total = 0;
        for(int i = 1; i <= a; i++)
        {
            total += i;
        }

        System.out.println("The sum of numbers from 1 to " + a + " is " + total);
    }
}
