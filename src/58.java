public class MathHomeworkSolver {
    public static void main(String[] args) {
        // Example 1: Simple arithmetic operations
        System.out.println("Addition: " + (5 + 3));
        System.out.println("Subtraction: " + (5 - 3));

        // Example 2: Calculating simple ratios
        double ratioA = 0.6;
        double ratioB = 0.8;
        double resultA = ratioA / ratioB;
        double resultB = 1 / ratioB;

        System.out.println("Ratio A: " + resultA);
        System.out.println("Ratio B: " + resultB);

        // Example 3: Calculating exponential growth
        long initialAmount = 100;
        double rateOfChange = 0.5;
        double finalAmount = Math.exp(initialAmount * rateOfChange);

        System.out.println("Final Amount: " + finalAmount);
    }
}
