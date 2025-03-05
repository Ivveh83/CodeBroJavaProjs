package OOB.Composition;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla model X", 2025, "electric");
//        System.out.println(car.model);
//        System.out.println(car.year);
        System.out.println(car.engine.type);
//        car.engine.start();
        car.start();

    }
}
