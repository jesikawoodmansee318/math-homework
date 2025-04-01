import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, welcome to the math quiz!");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", let's play a game!");

        int score = 0;
        for (int i = 1; i <= 3; i++) {
            double number1 = Math.random() * 20 + 5.985;
            double number2 = Math.random() * 4 - 2;
            
            System.out.println("Try to guess the following numbers: " + number1 + " and " + number2);
            int userGuess = scanner.nextInt();

            if (userGuess == Math.sqrt(number1) && userGuess <= 30) {
                score++;
            } else if (Math.abs(userGuess - Math.sqrt(number1)) < 2) {
                System.out.println("You guessed correctly!");
            } else if (userGuess != Math.sqrt(number1) || userGuess > 30) {
                System.out.println("That's not the correct guess. Try again.");
            }

            if (i == 3) {
                System.out.println("Congratulations, " + name + "! You got all three questions right!");
                break;
            }
        }

        scanner.close();
    }
}
