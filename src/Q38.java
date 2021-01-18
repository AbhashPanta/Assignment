import java.util.Scanner;

public class Q38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = sc.next();

        StringBuilder builder = new StringBuilder();
        builder.append(str);
        builder.reverse();

        String reverseStr = builder.toString();
        if (str.equals(reverseStr))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }


}
