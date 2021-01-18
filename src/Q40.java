import java.util.Scanner;

public class Q40 {

    public static String reverse(String str)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = sc.next();

        System.out.println("String in reverse: " + reverse(str));

        
    }


}
