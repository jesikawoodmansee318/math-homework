public class MathSolver {
    public static void main(String[] args) {
        // Example mathematical problem: Solve for x in the equation 2x + 3 = 11
        int x = solveEquation(2 * x + 3, 11);
        System.out.println("The value of x is " + x);
    }

    /**
     * Solves a given linear equation for 'x'.
     * 
     * @param leftSide The coefficient of the linear term.
     * @param rightSide The constant term.
     * @return The solution for 'x' in the equation.
     */
    public static int solveEquation(int leftSide, int rightSide) {
        return (rightSide - leftSide) / 2;
    }
}
