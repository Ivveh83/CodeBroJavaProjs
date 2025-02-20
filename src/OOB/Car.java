package OOB;

public class Car {

    String maker = "BMW";
    String model = "Z3";
    int year = 2025;
    double price = 30_000.15;
    boolean isRunning = false;

    void startCar(){
        System.out.println("Wrrooommmmm!!! " + maker + " " + model + " is running");
        isRunning = true;
    }
    void breakCar(){
        System.out.println("Scrieeeech!!");

    }
    void driveCar(){
        System.out.println("Yieehhaaa!!");
    }
    void stopCar(){
        System.out.println("Pyyysssssssschhh!!!");
        isRunning = false;
    }
}
