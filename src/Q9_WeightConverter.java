import java.util.Scanner;

public class Q9_WeightConverter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter weight in pounds(lbs):");
        double pounds = sc.nextDouble();
        double kg = pounds/2.2;
        System.out.println(pounds + " lbs  in kilograms is " + kg + " kgs.");

        System.out.println("Please enter weight in kilograms(kgs):");
        double kgs = sc.nextDouble();
        double pound = kgs * 2.2;

        System.out.println(kgs + " kgs  in pounds is " + pound + " lbs.");

    }
}
