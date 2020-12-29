public class Q30 {
    public static void main(String[] args) {
      int number = 10;

      for(int i = 0; i < number; i++)
      {
          System.out.print(fib(i) + " ");
      }
    }

    // Function to print the fibonacci series
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1)
                + fib(n - 2);
    }

}
