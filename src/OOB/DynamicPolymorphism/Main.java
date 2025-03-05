package OOB.DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want a Cat or a Dog? Type \"Cat\" or \"Dog\": ");
        String choice = scanner.nextLine();
        choice = choice.substring(0, 1).toUpperCase() + choice.substring(1); // First letter Capitilazed


        Animal animal = null;

        if (choice.equals("Dog")){
            animal = new Dog();
        }
        else if (choice.equals("Cat")){
            animal = new Cat();
        }
        else {
            System.out.println("No such animal");
        }

try {
    animal.speak();
}
catch (java.lang.NullPointerException _){
    System.out.println("Choose dog or cat");
}
finally {
    scanner.close();
}

    }
}
