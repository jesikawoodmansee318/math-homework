public class MathHomework {
    public static void main(String[] args) {
        // Example problem 1: find the smallest number in an array of integers
        int[] numbers = {5, 2, 8, 10};
        int minNumber = findSmallest(numbers);
        System.out.println("The smallest number is: " + minNumber);

        // Example problem 2: find the largest number in an array of integers
        int maxNumber = findLargest(numbers);
        System.out.println("The largest number is: " + maxNumber);

        // Example problem 3: calculate the sum of all elements in an array
        int[] numbers1 = {5, 2, 8, 10};
        int sum = Arrays.stream(numbers1).sum();
        System.out.println("The sum of all elements is: " + sum);
    }

    // Find the smallest number in an array of integers
    public static int findSmallest(int[] numbers) {
        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }

    // Find the largest number in an array of integers
    public static int findLargest(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }
}
