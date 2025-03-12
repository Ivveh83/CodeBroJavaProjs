package OOP.Aggregation;

class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;

    }

    void showLibrary(){
        System.out.println(this.name + " " + this.year);
        System.out.println("Books available: ");
        for (Book book : books){
            book.showInfo();
        }
    }
}
