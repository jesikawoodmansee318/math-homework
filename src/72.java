public class MathHomework {
    public static void main(String[] args) {
        // Example code to demonstrate mathematical operations
        int sum = 0;
        double product = 1.0;
        
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                sum += Math.pow(3, -i);
                product *= (Math.PI / (2 * i));
            }
        }
        
        System.out.println("The result of the mathematical operations is: " + sum + ", " + product);
    }
}
