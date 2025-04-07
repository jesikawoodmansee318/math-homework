import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        double difference = Math.abs(num1 - num2);
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The absolute value of " + num1 + " minus " + num2 + " is: " + difference);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("The quotient of " + num1 + " divided by " + num2 + " is: " + quotient);
    }
}
