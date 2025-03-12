package OOP.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(1);
//        arrayList.add(3);
//        arrayList.add(2);
////        System.out.println(arrayList);
//
//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("apple");
//        fruits.add("orange");
//        fruits.add("banana");
//        fruits.add("coconut");
//
//        fruits.remove(0);
//        fruits.set(1, "mango");
//
//        System.out.println(fruits);
//        System.out.println(fruits.get(1));
//
//        System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//
//        System.out.println(fruits);

        ArrayList<String> fruits = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of fruits you wish to store: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfFood; i++){
            System.out.print("Pick a fruit to the list: ");
            String choice = scanner.nextLine();
            fruits.add(choice);
        }

        System.out.println(fruits);


    }
}
