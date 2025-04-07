public class MathHomeworkSolver {
    public static void main(String[] args) {
        // Example problem 1: Simple arithmetic operations
        System.out.println("Result of 5 + 3 = " + (5 + 3));

        // Example problem 2: Calculating the square root of a number
        double result = Math.sqrt(16);
        System.out.println("Square root of 16 is " + result);

        // Example problem 3: Prime factorization of a number
        System.out.println("Prime factors of 10 are " + primeFactors(10));

        // Example problem 4: Multiplication table generator
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x 5 = " + (i * 5));
        }
    }

    // Helper method to find prime factors of a number
    private static int[] primeFactors(int num) {
        int factors[] = new int[2];
        if (num % 2 == 0) {
            factors[1] = 2;
            while (num % 2 == 0) {
                num /= 2;
            }
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            int factor = 2;
            while (num % i == 0) {
                factors[factor] = i;
                num /= i;
                if (factor == 10)
                    break;
                else
                    factor++;
            }
        }

        // Handle the case when the number is a prime number greater than 2
        if (num > 2) {
            int lastFactor = 2;
            while (num % lastFactor == 0) {
                factors[lastFactor] = num / lastFactor;
                return factors;
            }
        }

        // If the number is greater than 1, it's a prime number
        if (num > 1) {
            int lastFactor = 2;
            while (num % lastFactor == 0) {
                factors[lastFactor] = num / lastFactor;
                return factors;
            }
        }

        return null;
    }
}
