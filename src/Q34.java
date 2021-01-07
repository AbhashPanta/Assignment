import java.util.Arrays;
import java.util.Scanner;

public class Q34 {

    public void reverse(int[] array)
    {
        int [] temp  = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--)
        {
            temp[j] = array[i];
            j++;
        }

        for (int a : temp)
        {
            System.out.print(a + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 numbers in a row:");

        int[] array = new int[5];

        for(int i = 0; i < 5; i++)
        {
            int num = sc.nextInt();
            array[i] = num;
        }

        System.out.println();

        System.out.println("The array in reverse is: ");
        Q34 obj = new Q34();
        obj.reverse(array);
    }
}
