import java.util.Scanner;

public class MathHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println(num1 + " and " + num2 + " are both positive numbers.");
        } else if (num1 < 0 && num2 > 0) {
            System.out.println(num1 + " is negative, but its absolute value is greater than " + num2);
        } else if (num1 < 0 && num2 < 0) {
            System.out.println(num1 + " and " + num2 + " are both negative numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " have opposite signs, so their product is zero.");
        }
    }
}
