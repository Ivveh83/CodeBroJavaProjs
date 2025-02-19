import java.util.Locale;
import java.util.Scanner;

public class BankingProgram {
    static double balance;
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        //JAVA BANKING PROGRAM
        //DECLARE VARIABLES

        boolean isRunning = true;

        while (isRunning) {
            //DISPLAY MENU

            System.out.println("\n***************\n" +
                    "BANKING PROGRAM\n" +
                    "***************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            //GET AND PROCESS USERS CHOICE
            System.out.print("Type your choice: ");
            byte choice = scanner.nextByte();
            System.out.println("***************");
            switch (choice){
                case 1 -> showBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> {
                    System.out.println("Welcome back!");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice.");
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            if (choice == 1)
//                showBalance();
//            else if (choice == 2)
//                deposit();
//            else if (choice == 3)
//                withdraw();
//            else if (choice == 4) {
//                //EXIT MESSAGE
//                System.out.println("Welcome back!");
//                isRunning = false;
//            }
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    //showBalance()
    static void showBalance() {

        System.out.printf("Your balance is: $%.2f", balance);
    }

    //deposit()
    static void deposit() {
        System.out.print("Enter number to deposit: ");
        double amount = scanner.nextDouble();
        System.out.println("***************");
        if (amount > 0) {
            balance += amount;
            System.out.printf("You have deposited $%.2f", amount);
        }
        else
            System.out.println("Deposit must be a positive number.");
    }

    //withdraw()
    static void withdraw() {
        System.out.print("Enter number to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("***************");
            System.out.printf("You have withdraw $%.2f", amount);
        } else {
            System.out.println("***************");
            System.out.println("Withdraw Denied!");
        }
    }
}