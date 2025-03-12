package OOP.Super;

public class Employe extends Person{

    int salary;

    Employe(String first, String last, int salary){

        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is: $" + this.salary);
    }
}
