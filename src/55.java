public class MathHomework {
    public static void main(String[] args) {
        // Example 1: Sum of squares from 0 to 10
        long sumOfSquares = 0;
        for (int i = 0; i <= 10; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        System.out.println("Sum of squares from 0 to 10: " + sumOfSquares);

        // Example 2: Sum of cubes from 0 to 5
        long cubeSum = 0;
        for (int i = 0; i <= 5; i++) {
            cubeSum += Math.pow(i, 3);
        }
        System.out.println("Sum of cubes from 0 to 5: " + cubeSum);

        // Example 3: Fibonacci sequence
        long fibonacciSequence = 1L;
        for (int i = 0; i < 10; i++) {
            fibonacciSequence += 2 * fibonacciSequence - 1;
        }
        System.out.println("Fibonacci sequence: " + fibonacciSequence);

        // Example 4: Prime numbers between 1 and 50
        for (long i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        public static boolean isPrime(long number) {
            if (number < 2) return false;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) return false;
            }
            return true;
        }
    }
}
