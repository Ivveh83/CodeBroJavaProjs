package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }catch (InputMismatchException e){
            System.out.println("That wasn't a number!");
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }finally {
            scanner.close();
            System.out.println("This always executes");
        }
    }
}
