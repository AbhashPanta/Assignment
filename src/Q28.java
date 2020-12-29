import java.util.Scanner;

public class Q28 {
    public static boolean isPrimeNumber(int n)
    {
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int nthPrime(int n)
    {
        int num, count, i;
        num=1;
        count=0;

        while (count < n){
            num=num+1;
            for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
                if (num % i == 0) {
                    break;
                }
            }
            if ( i == num){//if it is a prime number
                count = count+1;
            }
        }
        System.out.println("Value of nth prime: " + num);
        return num;
    }

    public static void allPrimeBetween(int a, int b)
    {
        System.out.println();
        System.out.print("All primes between " + a + " and " + b + " = ");
        for(int i = a; i < b; i++)
        {
            if (isPrimeNumber(i))
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5));

        System.out.println(nthPrime(5));

        allPrimeBetween(2, 20);
    }

}
