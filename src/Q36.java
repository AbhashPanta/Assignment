import java.util.Arrays;
import java.util.Scanner;

public class Q36 {

    public void findDuplicates(int[] array)
    {
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    System.out.println(array[i] + " ");
                }
            }
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

        System.out.println("The duplicates are: ");
        Q36 obj = new Q36();
        obj.findDuplicates(array);

    }
}
