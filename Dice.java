import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Dice {

    static String[] asciiDices = {
            "-----\n" +
                    "|   |\n" +
                    "| o |\n" +
                    "|   |\n" +
                    "-----",

            "-----\n" +
                    "|o  |\n" +
                    "|   |\n" +
                    "|  o|\n" +
                    "-----",

            "-----\n" +
                    "|o  |\n" +
                    "| o |\n" +
                    "|  o|\n" +
                    "-----",

            "-----\n" +
                    "|o o|\n" +
                    "|   |\n" +
                    "|o o|\n" +
                    "-----",

            "-----\n" +
                    "|o o|\n" +
                    "| o |\n" +
                    "|o o|\n" +
                    "-----",

            "-----\n" +
                    "|o o|\n" +
                    "|o o|\n" +
                    "|o o|\n" +
                    "-----"
    };


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //JAVA DICE ROLLING PROGRAM


        //DECLARE VARIABLES
        byte numberOfDices = 0;
        while (numberOfDices <= 0) {

            // GET # OF DICE FROM USER
            System.out.println("How many dices: ");
            numberOfDices = scanner.nextByte();
            if (numberOfDices < 1)
                System.out.println("Number of Dice must be greater than 0");
        }

        // CHECK IF # OF DICE > 0

        //ROLL ALL THE DICE
        Random rand = new Random();
        int dices[] = new int[numberOfDices];
        for (int i = 0; i<numberOfDices; i++) {
            int number = rand.nextInt(1,7);
            dices[i] = number;
            // DISPLAY THE ASCII OF DICES
            System.out.print(asciiDices[dices[i] - 1]);
            System.out.println(" ");
            System.out.printf("You rolled: %d", number);
            System.out.println(" ");
        }


        //GET THE TOTAL
        int total = Arrays.stream(dices).sum();
        System.out.printf("Total Amount: %d", total);

    }
}
