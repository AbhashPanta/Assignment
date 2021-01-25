import java.io.*;
import java.util.Scanner;

public class Q44 {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("StudentList");
            for(int i = 1; i <= 10; i++)
            {
                String name = "Student " + i;
                String address = "Address " + i;
                Student s = new Student(name, address);
                fw.write(s.toString() + '\n');
            }

            fw.close();
            System.out.println("Wrote to the file.");
            System.out.println();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the student: ");
        String studentName = sc.nextLine();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("StudentList"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try
        {
            String line;
            while (true)
            {
                assert br != null;
                if (!((line = br.readLine()) != null)) break;
                String name = line.substring(0,line.indexOf("|"));
                if (name.equals(studentName))
                {
                    System.out.println(line);
                }
            }
        }
        catch(IOException ioExp)
        {
            ioExp.printStackTrace();
        }
        finally
        {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
