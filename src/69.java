public class MathHomework {
    // Example function to solve math problem
    public static double solveEquation(double a, double b, double c) {
        if (b != 0) {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant > 0) {
                return (-b + Math.sqrt(discriminant)) / (2 * a);
            } else if (discriminant == 0) {
                return -b / (2 * a);
            }
        }
        return "Equation has no real solutions";
    }

    // Example main method to test the solveEquation function
    public static void main(String[] args) {
        double a = 1, b = 3, c = -4;
        System.out.println("The solution is: " + solveEquation(a, b, c));
    }
}
