import java.util.Arrays;
import java.util.Scanner;

public class Q35 {

    public int secondLargestElement(int[] array)
    {
        Arrays.sort(array);
        return array[array.length - 2];
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
        Q35 obj = new Q35();
        System.out.println(obj.secondLargestElement(array));
    }
}
