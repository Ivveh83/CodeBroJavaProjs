import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RockPaperScissors {
    public static void main(String[] args) {

        //Inside a while loop ask user "Play again (yes/no): "?
        String[] choices =  {"rock", "paper", "scissors"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        String shouldContinue = "yes";

        while (isOn) {

            if (shouldContinue.equals("yes")) {

                System.out.print("Enter your move (rock, paper, scissors): ");
                String playerChoice = scanner.nextLine().toLowerCase();
                if (Arrays.asList(choices).contains(playerChoice)) {
                    String computerChoice = choices[random.nextInt(choices.length)];
                    System.out.println("Computer choice: " + computerChoice);

                    // rock beats scissors
                    if (computerChoice.equals(playerChoice))
                        System.out.println("It's a draw");
                    else if (computerChoice.equals("rock") && playerChoice.equals("paper"))
                        System.out.println("You win!");
                    else if (computerChoice.equals("paper") && playerChoice.equals("scissors"))
                        System.out.println("You win!");
                    else if (computerChoice.equals("scissors") && playerChoice.equals("rock"))
                        System.out.println("You win!");
                    else
                        System.out.println("You lose!");

                    System.out.println();
                    System.out.print("Play again (yes/no): ");
                    shouldContinue = scanner.nextLine();
                    System.out.println();
                }
                else {
                    System.out.println();
                    System.out.println("Wrong input. Write either rock, paper or scissors!");
                }
            }
            else if (shouldContinue.equals("no")) {
                isOn = false;
            }
            else {
                System.out.println("Wrong choice, write either \"yes\" or \"no\".");
                System.out.print("Play again (yes/no): ");
                shouldContinue = scanner.nextLine();
            }
        }
        System.out.println("Good Buy!");
        scanner.close();

        // scissors beats paper
        // paper beats rock
        //Ask user for rock, paper or scissors
        //Create a String[] of {rock, paper or scissors}
        // Pick one item randomly
        //Create an if-statement, compare user and computer - who beats who

    }
}
