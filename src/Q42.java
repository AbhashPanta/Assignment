import java.util.Scanner;

public class Q42 {

    public static boolean exists(String[] arr, String str)
    {
        for(String s : arr)
        {
            if (s != null && s.equals(str))
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a long string: ");
        String str = sc.nextLine();

        String[] tokens = str.split(" ");

        String[] duplicates = new String[tokens.length];
        int count = 0;

        System.out.println("The duplicate letters are: ");
        for(int i = 0; i < tokens.length; i++)
        {
            for (int j = i+1; j < tokens.length; j++)
            {
                if (tokens[i].equals(tokens[j]))
                {
                    if (!exists(duplicates,tokens[j]))
                    {
                        duplicates[count] = tokens[j];
                        count++;
                    }
                }
            }

        }

        // Print duplicates
        for(String s : duplicates) {
            if (s != null)
            {
                System.out.print(s + " ");
            }
        }

    }


}
