public class MathHomework {
    public static void main(String[] args) {
        // Example 1: Addition
        int sum = 5 + 3;
        System.out.println("The result of 5 + 3 is " + sum);

        // Example 2: Subtraction
        int diff = 8 - 2;
        System.out.println("The result of 8 - 2 is " + diff);

        // Example 3: Multiplication
        int prod = 7 * 4;
        System.out.println("The result of 7 * 4 is " + prod);

        // Example 4: Division
        int div = 15 / 3;
        System.out.println("The result of 15 / 3 is " + div);

        // Example 5: Exponentiation
        long exp = 2L; // Convert to Long for more accurate results with large numbers
        int power = 4;
        System.out.println("The result of " + exp + "^" + power + " is " + (long) Math.pow(exp, power));

        // Example 6: Square root
        double sqrt = Math.sqrt(25);
        System.out.println("The square root of 25 is " + sqrt);

        // Example 7: Factorial
        int factorial = 5 * 4 * 3 * 2;
        System.out.println("The factorial of 5 is " + factorial);
    }
}
