import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q25 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students:");
        int numStudents = sc.nextInt();


       Map<String,Integer> map = new HashMap<String,Integer>();
       for (int i = 0; i < numStudents; i++)
       {
           System.out.println("Please enter name of student " + i + ": ");
           String name = sc.next();

           System.out.println("Please enter the score of student " + i + ": ");
           int score = sc.nextInt();

           map.put(name,(Integer) score);
       }

       String winnerName="";
       int winnerScore = 0;

       for(Map.Entry<String,Integer> obj : map.entrySet())
       {
           if (obj.getValue() > winnerScore)
           {
               winnerScore = obj.getValue();
               winnerName = obj.getKey();
           }
       }

       System.out.println("The student with highest score is " + winnerName + " with score " + winnerScore);
    }
}
