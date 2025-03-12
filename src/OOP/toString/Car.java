package OOP.toString;

public class Car {

    String brand;
    String model;
    int year;
    String color;

    Car(String brand, String model, int year, String color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString(){
        return this.brand + " " + this.model + " " + this.year + " " + this.color;
    }
}
