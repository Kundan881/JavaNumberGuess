import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int number = rand.nextInt(10) + 1; // Random number 1 to 10
        int guess;

        System.out.println("Guess a number between 1 and 10:");

        guess = input.nextInt();

        if (guess == number) {
            System.out.println("Correct! 🎉");
        } else {
            System.out.println("Wrong! The number was " + number);
        }

        input.close();
    }
}