
public class MathHomework {
    public static void main(String[] args) {
        System.out.println("Welcome to Math Homework!");
        int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;
        int sum = num1 + num2;
        System.out.println("What is " + num1 + " + " + num2 + "?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == sum) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect, the correct answer is " + sum);
        }
    }
}