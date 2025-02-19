import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        //Create list of slot machine items
        int balance = 100;
        int score = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] slots = {"🍉", "🍒", "⭐", "🔔", "🍋"};
        String[] result = new String[3];
        boolean isOn = true;
        String input;

        //Welcome text "Welcome to Java Slots
        System.out.println("***************************");
        System.out.println("   Welcome to Java Slots");

        System.out.print("Symbols: ");
        for (String slot : slots) {
            System.out.print(slot);
        }
        System.out.println();
        System.out.println("***************************");
        //Initialize current balance check
        System.out.printf("Current Balance: $%d", balance);
        System.out.println();


        do {
            if (balance > 0) {
                //Ask the user to place a bet
                System.out.print("Place your bet amount: ");
                int betAmount = scanner.nextInt();
                if (betAmount <= balance && betAmount >= 0) {
                    System.out.println();
                    System.out.println("Spinning...");
                    // deduct amount from balance
                    balance -= betAmount;
                    // Spin the machine
                    for (int i = 0; i < result.length; i++) {
                        result[i] = slots[random.nextInt(slots.length)];
                    }
                    // demonstrate result
                    System.out.println("****************");
                    System.out.print("|");
                    for (String symbol : result) {
                        System.out.print(symbol);
                        System.out.print(" | ");
                    }
                    System.out.println();
                    System.out.println("****************");
                    System.out.println();
                    //Check if player win or lose
                    //kontrollera om en symbol förekommer 2 eller 3 gånger i resultatet
                    String currentSymbol = "p";

                    for (String symbol : result) {
                        if (currentSymbol.equals(symbol))
                            score++;

                        currentSymbol = symbol;
                    }
                    if (score > 1) {
                        balance += betAmount * 10;
                        System.out.println("You won $" + (betAmount * 10));
                    } else if (score > 0) {
                        balance += betAmount * 5;
                        System.out.println("You won $" + (betAmount * 5));
                    } else {
                        System.out.println("Sorry you lost this round");
                    }
                    // Check how much player wins, if two in a row, 5 x input amount, if three in a row 10 x input amount
                    score = 0;
                } else {
                    System.out.println();
                    System.out.println("Bet is not covered!");
                }
                if (balance > 0){
                    System.out.print("Do you want to continue (yes/no): ");
                    input = scanner.next().toLowerCase();
                    if (input.equals("no"))
                        isOn = false;
                    else if (input.equals("balance"))
                        System.out.printf("Balance: %d", balance);
                    System.out.println();
                }
            }
            else {
                isOn = false;
            }
                //Ask if player wants to contiue "Do you want to continue (yes/no): "
                // When player wants to quit, display the balance "GAME OVER! Your final balance is $xx"


        }
        while (isOn);
        System.out.println();
        System.out.printf("GAME OVER! Your final balance is $%d", balance);

    }
}

