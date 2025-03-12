package OOP.StaticKeyword;

public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Håkan Bråkan");
        Friend friend2= new Friend("Sune");
        Friend friend3 = new Friend("Klimpen");
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);

        Friend.showFriends();

//        long round = Math.round(3.99);
//        System.out.println(round);
    }
}
