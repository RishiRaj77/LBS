
public class Fibo {

	   // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
