package OOB.Abstract;

public abstract class Shape {

    abstract double area(); //ABSTRACT (Children Classes must have the method, and they need to define it themselves.)

    void shape(){
        System.out.println("This is a shape"); //CONCRETE (concrete methods are inherited, so no need to override or
                                                // implement this method for each Child Class.)
    }
}
