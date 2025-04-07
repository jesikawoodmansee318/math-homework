import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.printf("The sum of %f and %f is: %.2f\n", num1, num2, sum);

        if (num1 > num2) {
            System.out.println("First number is greater than second number.");
        } else {
            System.out.println("Second number is greater than first number.");
        }
    }
}
