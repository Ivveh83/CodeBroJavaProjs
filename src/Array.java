import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //SKAPA EN ARRAY

        //Initialisera variablerna size och listan
        int size;
        String[] foods;
        // Ta info från användaren hur många items i listan
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many foods do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];
        //Ta info från användaren om vilka maträtter som ska stå i listan
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Type in a food: ");
            String food = scanner.nextLine();
            foods[i] = food;
        }
        //skriva ut alla maträtterna
        for (String food : foods)
            System.out.println(food);

        // SÖKA GENOM EN ARRAY

        System.out.print("What food to find: ");
        String target = scanner.nextLine();

        boolean isFound = false;
        for (int i = 0; i < foods.length; i++){
            if (foods[i].equals(target)) {
                System.out.println("Your food is located at position " + i);
                isFound = true;
            }
        }
        if (!isFound)
            System.out.println("Food not found in array.");
        scanner.close();
    }
}
