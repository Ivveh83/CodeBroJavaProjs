package Hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO: A hangman game
        //Pick a random word from a list
        //Measure the words length
        //Create a String pickedWord of "____" according to the word length
        //Ask user to guess a letter
        //See if letter is in pickedWord
        //If letter is in pickedWord, create a new pickedWord string where the correct letter is on the
        // correct position, for instance "_b__"
        //Repeat process until either there are no empty spots left, or user ran out of tries

        String[] HANGMANPICS = {
                """
          +---+
          |   |
              |
              |
              |
              |
        =========
        """,
                """
          +---+
          |   |
          O   |
              |
              |
              |
        =========
        """,
                """
          +---+
          |   |
          O   |
          |   |
              |
              |
        =========
        """,
                """
          +---+
          |   |
          O   |
         /|   |
              |
              |
        =========
        """,
                """
          +---+
          |   |
          O   |
         /|\\  |
              |
              |
        =========
        """,
                """
          +---+
          |   |
          O   |
         /|\\  |
         /    |
              |
        =========
        """,
                """
          +---+
          |   |
          O   |
         /|\\  |
         / \\  |
              |
        =========
        """
        };

        String HANGMANPRESENTATION = """
       _                    _    _
      | |                  | |  | |
      | | __ ___   ____ _  | |__| | __ _ _ __   __ _ _ __ ___   __ _ _ __
  _   | |/ _` \\ \\ / / _` | |  __  |/ _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ 
 | |__| | (_| |\\ V / (_| | | |  | | (_| | | | | (_| | | | | | | (_| | | | |
  \\____/ \\__,_| \\_/ \\__,_| |_|  |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|
                                                __/ |                      
                                               |___/                       """;


        Scanner scanner = new Scanner(System.in);
        String randomWordString = pickRandomWord();

        int numberOfFalseGuesses = 0, TOTALPICS = 6;
        char userGuess;
        boolean correctInput = false;

        ArrayList<Character> alreadyGuessedLetters = new ArrayList<>();
        char[] concealedWord = new char[randomWordString.length()];
        Arrays.fill(concealedWord, '_');
        char[] wordToGuess = randomWordString.toCharArray();


//        System.out.println(wordToGuess);


        System.out.println("***************************************************************************");
        System.out.println("***************************************************************************");
        System.out.println(HANGMANPRESENTATION);
        System.out.println("***************************************************************************");
        System.out.println("***************************************************************************");
        System.out.println();


        while (!Arrays.equals(concealedWord, wordToGuess) && numberOfFalseGuesses < TOTALPICS) {

            System.out.println(HANGMANPICS[numberOfFalseGuesses]);
            System.out.println("*************************************************");
            System.out.print("Word of " + randomWordString.length() + " letters: ");
            System.out.println(concealedWord);
            System.out.println("*************************************************");
            System.out.println();
            System.out.print("Guess a letter: ");

            userGuess = scanner.next().toLowerCase().charAt(0);

            if (alreadyGuessedChar(userGuess, alreadyGuessedLetters)) {
                System.out.printf("""
                        *************************************************
                               You have already guessed this letter!
                                    Number of false guesses: %d/%d
                        *************************************************
                        """, numberOfFalseGuesses, TOTALPICS);
                continue;
            }
            alreadyGuessedLetters.add(userGuess);


            for (int i = 0; i < wordToGuess.length; i++) {
                if (userGuess == wordToGuess[i]) {
                    concealedWord[i] = userGuess;
                    correctInput = true;
                }
            }
            if (correctInput) {
                System.out.printf("""
                        
                        *************************************************
                                        Correct guess!
                                  Number of false guesses: %d/%d
                        *************************************************
                        
                        """, numberOfFalseGuesses, TOTALPICS);
                correctInput = false;
//                System.out.println(HANGMANPICS[numberOfFalseGuesses]);
            } else {
                numberOfFalseGuesses += 1;
                System.out.printf("""
                        
                        *************************************************
                                        False guess!
                               Number of false guesses: %d/%d
                        *************************************************
                        
                        """, numberOfFalseGuesses, TOTALPICS);
            }
        }

        if (Arrays.equals(concealedWord, wordToGuess)) {
            System.out.println(HANGMANPICS[numberOfFalseGuesses]);
            System.out.printf("""
                    *************************************************
                                    CONGRATULATIONS
                      You have found the correct word which was: %s
                           You have guessed false %d/%d times.
                                       GAME OVER
                    *************************************************
                    """,randomWordString, numberOfFalseGuesses, TOTALPICS);
        } else {
            System.out.println(HANGMANPICS[numberOfFalseGuesses]);
            System.out.printf("""
                    *************************************************
                                        GAME OVER
                                You have guessed %d/%d times.
                                The correct word was: %s
                                  Better luck next time!
                    *************************************************
                    """, numberOfFalseGuesses, TOTALPICS, randomWordString);
        }
        scanner.close();
    }

    private static String pickRandomWord() {
        String filepath = "src/Hangman/words.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            Random random = new Random();
            int targetLine = random.nextInt(1, 21);
            int currentLine = 1;
            while ((line = reader.readLine()) != null) {
                if (currentLine == targetLine) {
                    return line.toLowerCase().trim();
                }
                currentLine++;
            }
        } catch (IOException e) {
            System.err.println("Fel vid läsning av filen: " + e.getMessage());

        }
        return "pony";
    }

    private static boolean alreadyGuessedChar(char guessedChar, ArrayList<Character> guessedChars) {
        for (char c : guessedChars) {
            if (guessedChar == c) {
                return true;
            }
        }
        return false;
    }
}
