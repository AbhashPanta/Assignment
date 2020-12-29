import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the day(1-7):");
        int a = sc.nextInt();
        String day = "";
        switch(a)
        {
            case 1: day="Sunday";
            break;
            case 2: day = "Monday";
            break;
            case 3: day = "Tuesday";
            break;
            case 4: day = "Wednesday";
            break;
            case 5: day = "Thursday";
            break;
            case 6: day = "Friday";
            break;
            case 7: day = "Saturday";
            break;
        }

        System.out.println("Day: " + day);
    }
}
