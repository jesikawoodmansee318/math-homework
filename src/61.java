public class MathProblemSolver {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }
}
