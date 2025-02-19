import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        String[] questions = {"Which of these is NOT an Australian state or territory?",
                "What year did the game 'Overwatch' enter closed beta?",
                "The collapse of the Soviet Union took place in which year?",
                "The largest consumer market in 2015 was...",
                "When was Google founded?"};

        String[][] options =    {{"Alberta", "New South Wales", "Victoria", "Queensland"},
                                {"2015", "2013", "2011", "2016"},
                                {"1991",  "1992", "1891", "1990"},
                                {"USA", "Germany", "Japan", "United Kingdom"},
                                {"September 4, 1998",   "October 9, 1997", "December 12, 1989", "Feburary 7th, 2000"}};

        String[][] correctAnswers = {{"Alberta", "1"}, {"2015", "1"}, {"1991", "1"}, {"USA", "1"}, {"September 4, 1998", "1"}};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("Welcome to the JavaQuiz Game!");
        System.out.println("*****************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
                for (int t = 0; t < options[i].length; t++){
                    System.out.println((t + 1) + ". " + options[i][t]);
                    }
            System.out.print("Your guess: ");
            String answer = scanner.nextLine();
            if (answer.equals(correctAnswers[i][0]) || answer.equals(correctAnswers[i][1]))
                score++;
        }
        System.out.println("********************************");
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        System.out.println("********************************");
        scanner.close();
    }
}

