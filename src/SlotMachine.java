import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        //Create list of slot machine items
        int balance = 100;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] slots = {"🍉", "🍒", "⭐", "🔔", "🍋"};
        String[] result = new String[3];
        boolean isOn = true;
        String input = "yes";

        //Welcome text "Welcome to Java Slots"
        welcomeMessage(slots, balance);

        do {
            if (balance > 0 && !input.equals("no")) {
                //Ask the user to place a bet
                System.out.print("Place your bet amount: ");
                int betAmount = scanner.nextInt();
                if (betAmount <= balance && betAmount > 0) {
                    // deduct amount from balance
                    balance -= betAmount;
                    // Spin the machine
                    System.out.println();
                    System.out.println("Spinning...");
                    for (int i = 0; i < result.length; i++) {
                        result[i] = slots[random.nextInt(slots.length)];
                    }
                    // demonstrate result
                    printRow(result);

                    balance = calculateWinnings(result, balance, betAmount);

                } else {
                    System.out.println();
                    System.out.println("Bet is not possible!");
                }
                //Ask if player wants to contiue "Do you want to continue (yes/no): "
                if (balance > 0){
                    System.out.print("Do you want to continue? Write (yes/no/balance): ");
                    input = scanner.next().toLowerCase();
                    if (input.equals("no"))
                        isOn = false;
                    else if (input.equals("balance")) {
                        System.out.println();
                        System.out.printf("Balance: $%d", balance);
                        System.out.println();
                        System.out.print("Do you want to continue (yes/no): ");
                        input = scanner.next().toLowerCase();
                    }
                    System.out.println();
                }
            }
            else {
                isOn = false;
            }
        }
        while (isOn);
        // When player wants to quit, display the balance "GAME OVER! Your final balance is $xx"
        System.out.println();
        System.out.printf("GAME OVER! Your final balance is $%d", balance);
        scanner.close();

    }

    static void printRow(String[] row) {
        System.out.println("****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("****************");
        System.out.println();
    }
    static int calculateWinnings(String[] result, int balance, int betAmount){
        String currentSymbol = "p";
        int score = 0;

        for (String symbol : result) {
            if (currentSymbol.equals(symbol))
                score++;
            currentSymbol = symbol;
        }
        // Check how much player wins, if two in a row, 5 x input amount, if three in a row 10 x input amount
        if (score > 1) {
            balance += betAmount * 10;
            System.out.println("You won $" + (betAmount * 10));
        }
        else if (score > 0) {
            balance += betAmount * 5;
            System.out.println("You won $" + (betAmount * 5));
        }
        else {
            System.out.println("Sorry you lost this round");
        }
        score = 0;
        return balance;
    }
    static void welcomeMessage(String[] slots, int balance){
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
    }
}

