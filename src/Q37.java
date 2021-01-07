import java.util.Arrays;
import java.util.Scanner;

public class Q37 {

    public boolean addMatrices(int[][] array1, int[][] array2)
    {
        if (array1.length != array2.length)
        {
            return false;
        }
        int[][] sum = new int[array1.length][array1.length];


        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1[i].length; j++)
            {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        printArray(sum);
        return true;

    }

    public void printArray(int [][] array)
    {
        for (int[] arr: array)
        {
            for (int a : arr)
            {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }






    public static void main(String[] args) {

        int [][] array1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int [][] array2 = new int[][] {{4,5,6}, {2,7,8}, {3,1,9}};

        System.out.println();


        System.out.println("The matrices are: ");
        Q37 obj = new Q37();
        obj.printArray(array1);
        obj.printArray(array2);

        System.out.println(" The sum of the matrices is the following matrix: ");
        if (!obj.addMatrices(array1, array2))
        {
            System.out.println("Something went wrong. Please check the dimension of the matrices. ");
        }

    }


}
