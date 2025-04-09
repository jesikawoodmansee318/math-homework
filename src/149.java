import java.util.*;

class MathSolver {
    public int calculate(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("除数不能为零");
        }
        return x / y;
    }

    static class Solution {
        public static void main(String[] args) {
            System.out.println(calculate(4, 2)); // Output: 2
        }
    }
}
