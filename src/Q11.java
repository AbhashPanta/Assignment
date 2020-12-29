import java.util.Scanner;

public class Q11 {
    public static void main(String args[]){

        int a = 10;
        int b = 20;

//        // The following uses temp variable
//        int temp = a;
//        a = b;
//        b = temp;

        // The following uses bitwise operator
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);

    }

}
