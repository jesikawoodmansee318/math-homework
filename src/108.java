public class MathHomework {
    public static void main(String[] args) {
        // Example math homework problem 1: Addition
        System.out.println("Addition result: " + (a + b));

        // Example math homework problem 2: Subtraction
        System.out.println("Subtraction result: " + (a - b));

        // Example math homework problem 3: Multiplication
        System.out.println("Multiplication result: " + (a * b));

        // Example math homework problem 4: Division
        if (a != 0) {
            System.out.println("Division result: " + (a / b));
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    private static int a;
    private static int b;
}
