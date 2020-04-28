package module4libraly;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Flowers for Algernon","Daniel Keyes","Harcourt",(short) 1959,311,"твердый",1000);
        Books book2 = new Books("Harry Potter and the Philosopher's Stone","Rowling","",(short) 2009,201,"МЯГКИЙ ПЕРЕПЛЕТ",5);

        Library booksInLibraly = new Library();
        booksInLibraly.AddBookForLibraly(book1);
        booksInLibraly.AddBookForLibraly(book2);

        booksInLibraly.SearchByAuthor("Daniel Keyes");
        booksInLibraly.SearchByPublishingHouse("");
        booksInLibraly.SearchByTheYearOfPublishing((short) 1959);
        booksInLibraly.ListBookOnLibraly("","");
    }
}
