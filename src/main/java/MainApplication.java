public class MainApplication {

    //Array created to save the values already calculated
    private static long[] fibonacciCache;

    public static void main(String[] args) {

        //Sequence number in fibonacci sequence that you want to show
        int n = 8;

        //Defining the array length. n+1 because the sequence starts from 0. So, we have to cover it completely;
        fibonacciCache = new long[n + 1];

        //For loop that prints the entire fibonacci sequence until the input number
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    //Recursive method that calculates the fibonacci sequence
    private static long fibonacci(int n) {

        //Validation that prevents a stackoverflow error
        if (n <= 1) {
            return n;
        }

        //Return the value in sequence that already has been calculated. So, the program don't have to calculate the value again
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        //Takes the value once calculated and saves it in the Fibonacci Cache before returning it.
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
