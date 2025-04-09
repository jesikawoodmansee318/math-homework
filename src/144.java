public class MathHomework {
    public static void main(String[] args) {
        // Example 1: Addition of two numbers
        int num1 = 5;
        int num2 = 3;
        System.out.println("The sum is: " + (num1 + num2));

        // Example 2: Multiplication of two numbers
        double num3 = 7.5;
        double num4 = 2.5;
        System.out.println("The product is: " + (num3 * num4));

        // Example 3: Division of one number by another
        int result1 = 10 / 2;
        double result2 = 8.0 / 3;
        System.out.println("The quotient is: " + result1);
        System.out.println("The result using floating point division: " + result2);

        // Example 4: Addition of two arrays
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {4, 5, 6};

        System.out.println("Arrays A and B have the same length: " + (arrayA.length == arrayB.length));

        // Example 5: Comparison of two arrays
        int arrayC[] = {7, 9, 2};
        int arrayD[] = {1, 4, 3};

        System.out.println("Array C is greater than Array D: " + (arrayC > arrayD));
    }
}
