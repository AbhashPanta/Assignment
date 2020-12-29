import java.util.Scanner;
import java.math.*;

public class Q10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the initial velocity(u):");
        double a_u = sc.nextDouble();
        System.out.println("Please enter the time(t): ");
        double a_t = sc.nextDouble();
        System.out.println("Please enter the acceleration(a):");
        double a_a = sc.nextDouble();

        double a_s = a_u * a_t + 0.5 * a_a * Math.pow(a_t,2.0);

        System.out.println("The distance (s) is: " + a_s);


        // ************************************************************

        System.out.println("Please enter s: ");
        double b_s = sc.nextDouble();
        System.out.println("Please enter a: ");
        double b_a = sc.nextDouble();
        System.out.println("Please enter b: ");
        double b_b = sc.nextDouble();
        System.out.println("Please enter c: ");
        double b_c = sc.nextDouble();

        double b_area = Math.sqrt(b_s * (b_s - b_a) * (b_s - b_b) * (b_s * b_c));

        System.out.println("The area is: " + b_area);


        // ***********************************************************************************

        System.out.println("Please enter a: ");
        double c_a = sc.nextDouble();
        System.out.println("Please enter b: ");
        double c_b = sc.nextDouble();
        System.out.println("Please enter c: ");
        double c_c = sc.nextDouble();

        double c_x = (-c_b + Math.sqrt(Math.pow(c_b,2) - 4*c_a*c_c))/2*c_a;

        System.out.println("The value of x is: " + c_x);


    }
}
