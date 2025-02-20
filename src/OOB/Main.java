package OOB;


public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
////        System.out.println(car.model);
//        car.startCar();
//        System.out.println(car.isRunning);
//        car.driveCar();
//        car.breakCar();
//        car.stopCar();
//        System.out.println(car.isRunning);
//    }
//        Student student1 = new Student("Håkan Bråkan", 8, 2.1);
//        Student student2 = new Student("Sune", 10, 3.0);
//
//        System.out.println(student1.name);
//        System.out.println(student2.name);
//        User user3 = new User("Sune", "sune@klimpen.se", 10);
//        System.out.println(user3.userName);
//        System.out.println(user3.email);
//        System.out.println(user3.age);
//        User user2 = new User("Klimpen", "klimpen@klimpen.se");
//        System.out.println(user2.userName);
//        System.out.println(user2.email);
//        System.out.println(user2.age);
//        User user1 = new User("Håkan");
//        System.out.println(user1.userName);
//        System.out.println(user1.email);
//        System.out.println(user1.age);
//        CarTwo carTwo1 = new CarTwo("Toyota-Turbo-Cocacola", "red");
//        CarTwo carTwo2 = new CarTwo("Ferrari", "blue");
//        CarTwo carTwo3 = new CarTwo("Volvo", "beige");

//        CarTwo[] cars = new CarTwo[3];
//        cars[0] = carTwo1;
//        cars[1] = carTwo2;
//        cars[2] = carTwo3;
//        CarTwo[] cars = {carTwo1, carTwo2, carTwo3};
        //Anonymous Objects
        CarTwo[] cars = {new CarTwo("Toyota-Turbo-Cocacola", "red"),
                       new CarTwo("Ferrari", "blue"),
                    new CarTwo("Volvo", "beige")};

        for (CarTwo car : cars)
            car.color = "black";

        for (int i = 0; i < cars.length; i++)
            cars[i].drive();
        System.out.println();
        for (CarTwo car : cars)
            car.drive();
        System.out.println();

    }
}