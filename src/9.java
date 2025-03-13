import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(20);
        int num2 = rand.nextInt(20);
        System.out.println("What is " + num1 + " times " + num2 + "?");
    }
}