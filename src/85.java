public class MathSolver {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 2.0;
        double c = -1.5;

        if (a == b && a == c) {
            System.out.println("All values are the same.");
        } else if (a > b && a > c) {
            System.out.println("The largest value is " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest value is " + b);
        } else {
            System.out.println("The largest value is " + c);
        }
    }
}
