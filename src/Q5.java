import java.io.*;
import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius of circle:");
        double radius = sc.nextDouble();
        double areaCircle = 3.14*radius*radius;

        System.out.println("Please enter length of rectangle:");
        double length = sc.nextDouble();
        System.out.println("Please enter breath of rectangle:");
        double breadth = sc.nextDouble();
        double rectangleArea = length * breadth;

        System.out.println("Please enter height of triangle:");
        double height = sc.nextDouble();
        System.out.println("Please enter base of rectangle:");
        double base = sc.nextDouble();
        double triangleArea = 0.5 * base * height;


        System.out.println("Area of circle: " + areaCircle);
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of triangle: " + triangleArea);

    }
}
