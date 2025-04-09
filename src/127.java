public class MathClass {
    public static void main(String[] args) {
        // This is a simple example to demonstrate basic arithmetic operations using Java.
        
        // Addition
        int num1 = 5;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Subtraction
        sum = num1 - num2;
        System.out.println("The result of " + num1 + " minus " + num2 + " is: " + sum);
        
        // Multiplication
        sum = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + sum);
        
        // Division
        if (num2 != 0) {
            sum = num1 / num2;
            System.out.println("The quotient of " + num1 + " divided by " + num2 + " is: " + sum);
        } else {
            System.out.println("Cannot divide by zero.");
        }
        
        // Exponentiation
        int exponent = 4;
        double result = Math.pow(num1, exponent);
        System.out.println("The result of " + num1 + " raised to the power of " + exponent + " is: " + result);
    }
}
