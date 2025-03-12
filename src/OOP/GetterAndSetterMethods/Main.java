package OOP.GetterAndSetterMethods;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Tesla", "black", 50000);

//        car.model = "Toyota";
        car.setColor("Blue");
//        car.setPrice(10);

        System.out.println(car.getColor() + " " + car.getModel() + " $" + car.getPrice());
    }
}
