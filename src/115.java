public class MathProblemSolver {
    public static int solveEquation(String equation) {
        // Define variables for coefficients
        double coeffA = 0;
        double coeffB = 1;

        // Map characters to their corresponding values
        final char[] operators = {'+', '-'}; // Add more operators if needed

        // Iterate through each character in the equation
        for (char c : equation.toCharArray()) {
            switch (c) {
                case '+':
                    coeffA += coeffB;
                    break;
                case '-':
                    coeffA -= coeffB;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator detected.");
            }
        }

        // Return the result
        return Math.abs(coeffA) / Math.abs(coeffB);
    }
}
