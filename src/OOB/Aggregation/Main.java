package OOB.Aggregation;

class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Fellowship of the Ring", 464);
        Book book2 = new Book("The two Towers", 356);
        Book book3 = new Book("Return of the King", 432);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Stockholms Stadsbibliotek", 1928, books);

        library.showLibrary();
    }

}
