import java.util.Arrays;
import java.util.Scanner;

public class Q33 {

    public void ascending(int[] array)
    {
        Arrays.sort(array);
        for(int a : array)
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

        System.out.println("The array in ascending order is: ");
        Q33 obj = new Q33();
        obj.ascending(array);
    }
}
