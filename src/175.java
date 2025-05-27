public class Math homework {
    // Function to calculate the area of a rectangle
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    // Main method for testing the calculateArea function
    public static void main(String[] args) {
        // Test data points
        double testWidth = 10.0;
        double testHeight = 5.0;

        System.out.println("Rectangle area: " + calculateArea(testWidth, testHeight));
    }
}
