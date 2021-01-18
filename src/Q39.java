import java.util.Scanner;

public class Q39 {

    public static String nameInShort(String name)
    {
        String[] tokens = name.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tokens.length - 1; i++)
        {
            String s = tokens[i];
            sb.append(s.charAt(0));
            sb.append(". ");
        }

        sb.append(tokens[tokens.length-1]);
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a name: ");
        String str = sc.nextLine();

        System.out.println("Name in short: " + nameInShort(str));


    }


}
