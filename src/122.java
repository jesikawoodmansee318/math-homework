public class Math homework {
    public static void main(String[] args) {
        // Example of basic mathematical operations
        System.out.println("10 - 5 = " + (10 - 5)); // Output: 5

        // Example of using loops for iterations
        int i = 0;
        while(i < 5){
            System.out.println("i is " + i);
            i++;
        }

        // Example of arithmetic expressions with variables
        double x = 3.14159;
        double y = 2.71828;
        int z = 5;
        System.out.println("x squared: " + Math.pow(x, 2) + "\n" +
                            "y squared: " + Math.pow(y, 2) + "\n" +
                            "z plus x squared: " + (Math.pow(x, 2) + y));
    }
}
