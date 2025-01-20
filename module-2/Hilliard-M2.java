import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Display the choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Generate the computer's choice
        Random random = new Random();
        int computerChoice = random.nextInt(3); // 0 for Rock, 1 for Paper, 2 for Scissors

        // Prompt the user for their choice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's Play Rock-Paper-Scissors!");
        System.out.println("Pick a number.");
        System.out.println("Pick 0 for Rock, 1 for Paper, 2 for Scissors");

        int userChoice = -1;
        while (true) {
            System.out.print("Your choice (0, 1, or 2): ");
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
                if (userChoice >= 0 && userChoice <= 2) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 0, 1, or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Display choices
        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        // Display the result
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2) || 
                   (userChoice == 1 && computerChoice == 0) || 
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You won!");
        } else {
            System.out.println("The Computer won!");
        }

        scanner.close();
    }
}
