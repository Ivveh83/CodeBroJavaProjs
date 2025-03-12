package OOP.Interface;

public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("The Fish is on the hunt");
    }

    @Override
    public void flee() {
        System.out.println("The Fish swims away");

    }
}
