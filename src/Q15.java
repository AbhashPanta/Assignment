import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an ASCII character number (0-128):");
        int num = sc.nextInt();
        System.out.println("The character for " + num + " ASCII value is " + Character.toString((char)num));
    }
}
