import java.util.*;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        
        if (name.isEmpty()) {
            System.out.println("Invalid input. Please enter a valid name.");
            return;
        }
        
        System.out.println("Hello, " + name + "! Here are some math problems and their solutions:");
        for (int i = 1; i <= 5; i++) {
            double x = Math.random();
            double y = Math.random();
            
            if (i == 1) {
                solution = solve(x, y);
            } else {
                solution = "";
            }
            
            System.out.println("Problem " + i + ": " + problem);
            System.out.println("Solution: " + solution);
        }
    }

    static double solve(double x, double y) {
        // Your implementation for solving the math problem goes here
        return 0.0;
    }

    static String problem = "";
}
