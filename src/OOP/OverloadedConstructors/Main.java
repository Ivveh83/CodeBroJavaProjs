package OOP.OverloadedConstructors;

public class Main {
    public static void main(String[] args) {
        User user3 = new User("Sune", "sune@klimpen.se", 10);
        System.out.println(user3.userName);
        System.out.println(user3.email);
        System.out.println(user3.age);
        User user2 = new User("Klimpen", "klimpen@klimpen.se");
        System.out.println(user2.userName);
        System.out.println(user2.email);
        System.out.println(user2.age);
        User user1 = new User("Håkan");
        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);
    }
}
