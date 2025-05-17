public class MathHomework {
    public static void main(String[] args) {
        // Example code for basic arithmetic operations
        int a = 5;
        int b = 3;
        System.out.println("The result of " + a + " + " + b + " is: " + (a + b));
        
        // Example code for calculating the area of a rectangle
        double width = 10.0;
        double height = 5.0;
        double area = width * height;
        System.out.println("The area of the rectangle with dimensions " + width + " x " + height + " is: " + area);
        
        // Example code for finding the maximum value in an array
        int[] numbers = {1, 2, 3, 4};
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("The maximum value in the array is: " + maxNumber);
    }
}
