public class MathHomework {
    public static void main(String[] args) {
        // Example of mathematical expression evaluation
        double result = calculateExpression("3 + 5 * 2");
        System.out.println("Result: " + result);
        
        // Another example with variable assignment
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum of a and b: " + sum);
    }
    
    private static double calculateExpression(String expression) {
        try {
            double result = Math.parse(expression);
            return result;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
