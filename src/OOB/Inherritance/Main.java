package OOB.Inherritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Plant plant = new Plant();
        cat.eat();

        cat.speak();
        System.out.println("Cat has " + cat.lives + " lives");
        dog.speak();
        System.out.println("Dog has " + dog.lives + " lives");
        System.out.println("Animal is alive: " + cat.isAlive);
        System.out.println("Plant is alive: " + plant.isAlive);
        plant.photosyntesize();

    }

}

