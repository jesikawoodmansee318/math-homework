import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double product = num1 * num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        scanner.close();
    }
}
