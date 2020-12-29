import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius of circle:");
        double radius = sc.nextDouble();
        double perimeterOfCircle = 2*3.14*radius;

        System.out.println("Please enter length of rectangle:");
        double length = sc.nextDouble();
        System.out.println("Please enter breath of rectangle:");
        double breadth = sc.nextDouble();
        double perimeterOfRectangle = 2* (length + breadth);

        System.out.println("Please enter length of side 1 of triangle:");
        double l1 = sc.nextDouble();
        System.out.println("Please enter length of side 2 of triangle:");
        double l2 = sc.nextDouble();
        System.out.println("Please enter length of side 3 of triangle:");
        double l3 = sc.nextDouble();


        double perimeterOfTriangle = l1+l2+l3;

        System.out.println("Perimeter of circle: " + perimeterOfCircle);
        System.out.println("Perimeter of rectangle: " + perimeterOfRectangle);
        System.out.println("Perimeter of triangle: " + perimeterOfTriangle);

    }

}
