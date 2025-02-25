package OOB.Super;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivar", "Högblom");
                person.showName();

        Student student = new Student("Harry", "Potter", 4.9);

        student.showName();
        student.showGpa();

        Employe employe = new Employe("Luke", "Skywalker", 35000);
        employe.showSalary();
    }
}
