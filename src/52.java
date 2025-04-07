public class MathHomework {
    public static void main(String[] args) {
        // Example usage of Java classes

        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Perform addition operation
        double result = calculator.add(5, 3);
        System.out.println("Result: " + result);

        // Another example with method overloading
        MethodOverloadingCalculator method = new MethodOverloadingCalculator();
        double anotherResult = method.add(2, 4);
        System.out.println("Another Result: " + anotherResult);
    }
}

// Calculator class for basic arithmetic operations

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    // Example overloaded method with different parameters
    public static double add(double a, double b, double c) {
        return a + b + c;
    }
}
