public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        // Program to find the nth fibonacci number using recursion
        System.out.println(fibonacci(4));
    }

    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
