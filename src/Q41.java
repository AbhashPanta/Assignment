import java.util.Scanner;

public class Q41 {

    public static boolean exists(char[] arr, char a)
    {
        for(char c : arr)
        {
            if (c == a)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = sc.next();

        char[] arr = str.toCharArray();

        char[] duplicates = new char[str.length()];
        int count = 0;

        System.out.println("The duplicate letters are: ");
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    if (!exists(duplicates,arr[j]))
                    {
                        duplicates[count] = arr[j];
                        count++;
                    }
                }
            }

        }

        // Print duplicates
        for(char c : duplicates)
        {
            System.out.print(c + " ");
        }

    }


}
