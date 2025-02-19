public class Method {

    static int x = 2;


    public static void main(String[] args) {

//        String name = "Ivar";
//        byte age = 41;
//
//        happyBirthday(name, age);
//        happyBirthday(name, age);
//        happyBirthday(name, age);
//        System.out.println(square(56));
//        System.out.println(getFullName("Mårten", "Gås"));
//
//    }
//    static void happyBirthday(String name, byte age){
////        System.out.println("Happy Birthday 2U!");
////        System.out.printf("Happy Birthday mr. %s!\n", name);
////        System.out.printf("You are %d years old!\n", age);
////        System.out.println("Happy Birthday 2U!\n");
//    }
//    static double square(double number){
//        return number * number;
//    }
//    static String getFullName(String first, String last){
//        return first + " " + last;
//    }
//}
//        String pizza = bakePizza("flat bread", "pineapple");
//        System.out.println(pizza);
        System.out.println(x);

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String topic){
        return bread + " " + topic + " pizza";
    }

}