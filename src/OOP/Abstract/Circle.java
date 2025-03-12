package OOP.Abstract;

public class Circle extends Shape{


                                //area of a circle is calculated through formula: A=πr2
    double radius;
    double area;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
}
