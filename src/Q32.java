import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 numbers in a row:");

        int []array= new int[5];

        for(int i = 0; i < 5; i++)
        {
            int num = sc.nextInt();
            array[i] = num;
        }

        System.out.println("The sum of numbers in the array is " + getSum(array));
    }

    public static int getSum(int [] array)
    {
        int total = 0;
        for(int num : array)
        {
            total += num;
        }
        return total;
    }
}
