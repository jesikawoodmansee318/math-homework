public class MathHomework {
    public static void main(String[] args) {
        // Random number generation
        int randomNumber = (int)(Math.random() * 100);
        System.out.println("Random number: " + randomNumber);

        // Comparison operations
        if (randomNumber > 50) {
            System.out.println("The number is greater than 50.");
        } else {
            System.out.println("The number is not greater than 50.");
        }

        // Math functions
        int sum = 1 + 2;
        int difference = 3 - 2;

        if (difference == 1) {
            System.out.println("Difference is 1.");
        } else {
            System.out.println("Difference is not 1.");
        }
    }
}
