public class MathHomework {
    public static void main(String[] args) {
        System.out.println("Welcome to Math Homework!");
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        System.out.println("Your homework is to solve the equation:");
        System.out.print(a + "x^2 + " + b + "x + " + c + " = ");
        int solution = (int) ((a * a * c) + (b * c));
        System.out.println("The solution is " + solution);
    }
}
