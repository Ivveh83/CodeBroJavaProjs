package OOB.ArrayOfObjects;

// ARRAY OF OBJECTS

public class CarTwo {

    String model;
    String color;

    CarTwo(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}

