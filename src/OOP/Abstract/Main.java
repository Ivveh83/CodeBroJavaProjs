package OOP.Abstract;

public class Main {
    public static void main(String[] args) {


//    Shape shape = new Shape();
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2, 2);
        Rectangle rectangle = new Rectangle(2, 3);

        circle.shape();
        triangle.shape();
        rectangle.shape();
        System.out.println();
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}
