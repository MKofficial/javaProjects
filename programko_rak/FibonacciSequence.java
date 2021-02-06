package programko_rak;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 14.10.2020
 */
public class FibonacciSequence {
    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(FibonacciSequence.fib(3));
    }
}
