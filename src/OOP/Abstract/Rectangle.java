package OOP.Abstract;

public class Rectangle extends Shape{

    double height;
    double lenght;

    Rectangle(double height, double lenght){
        this.height = height;
        this.lenght = lenght;
    }

    @Override
    double area(){
        return height * lenght;
    }
}
