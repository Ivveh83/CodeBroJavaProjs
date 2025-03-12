package OOP.ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
//        CarTwo carTwo1 = new CarTwo("Toyota-Turbo-Cocacola", "red");
//        CarTwo carTwo2 = new CarTwo("Ferrari", "blue");
//        CarTwo carTwo3 = new CarTwo("Volvo", "beige");

//        CarTwo[] cars = new CarTwo[3]; cars[0] = carTwo1; cars[1] = carTwo2; cars[2] = carTwo3;
//        CarTwo[] cars = {carTwo1, carTwo2, carTwo3};
//        Anonymous Objects
        CarTwo[] cars = {new CarTwo("Toyota-Turbo-Cocacola", "red"),
                       new CarTwo("Ferrari", "blue"),
                    new CarTwo("Volvo", "beige")};



        for (int i = 0; i < cars.length; i++)
            cars[i].drive();
        System.out.println();

        for (CarTwo car : cars)
            car.color = "black";

        for (CarTwo car : cars)
            car.drive();
        System.out.println();
    }
}
