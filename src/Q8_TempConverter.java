import java.util.Scanner;

public class Q8_TempConverter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature in Fahrenheit:");
        double tempInFahren = sc.nextDouble();
        double celsius = (5.0/9)*(tempInFahren - 32);
        System.out.println(tempInFahren + "F  in celsius is " + celsius + "C.");

        System.out.println("Please enter the temperature in Celsius:");
        double tempInCelsius = sc.nextDouble();
        double fahrenheit = (9.0/5)*tempInCelsius + 32;

        System.out.println(tempInCelsius + "C  in celsius is " + fahrenheit + "F.");

    }
}