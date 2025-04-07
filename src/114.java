public class MathHomework {
    public static void main(String[] args) {
        // Example 1: Simple arithmetic operations

        System.out.println("Addition: " + (30 + 5));
        System.out.println("Subtraction: " + (20 - 10));
        System.out.println("Multiplication: " + (20 * 4));

        // Example 2: Calculating square roots
        double number = 9;
        double result = Math.sqrt(number);
        System.out.println("Square root of " + number + ": " + result);

        // Example 3: Prime factorization

        int number = 18;
        int[] factors = primeFactors(number);
        System.out.println("Prime factors of " + number + " are: " + Arrays.toString(factors));

        // Example 4: Finding the greatest common divisor (GCD)

        int a = 25;
        int b = 30;
        int gcd = findGreatestCommonDivisor(a, b);
        System.out.println("The greatest common divisor of " + a + " and " + b + " is: " + gcd);

    }

    // Helper function to calculate the prime factors
    private static int[] primeFactors(int number) {
        int count = 0;
        while (number % 2 == 0) {
            count++;
            number /= 2;
        }
        return new int[]{count, number};
    }

    // Helper function to find the greatest common divisor of two numbers
    private static int findGreatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
