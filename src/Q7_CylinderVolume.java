import java.sql.SQLOutput;
import java.util.Scanner;
import java.math.*;

public class Q7_CylinderVolume {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius of cylinder:");
        double radius = sc.nextDouble();

        System.out.println("Please enter length of cylinder:");
        double length = sc.nextDouble();

        double volume = 3.14*radius*radius*length;
        System.out.println("The volume of the cylinder is " + volume);

    }
}
