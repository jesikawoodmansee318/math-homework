public class MathHomework {
    public static void main(String[] args) {
        // Example of mathematical operations
        System.out.println("Square root: " + Math.sqrt(16));
        System.out.println("Factorial: " + calculateFactorial(5));
    }

    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
