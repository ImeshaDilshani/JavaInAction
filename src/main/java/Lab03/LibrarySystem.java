package Lab03;

public class LibrarySystem {
    public static void main(String[] arg){
        // Create instances of the Book class representing library books
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        // Create an instance of the Library class to manage the library system
        Library library = new Library();

        // Add the created books to the library's collection
        library.addLibraryItems(book1);
        library.addLibraryItems(book2);
        library.addLibraryItems(book3);

        // Display information about the library
        library.DisplayLibraryInfo();

        // List all available library items
        library.ListAvailableItems();

        // Check out a book
        library.checkoutItems("Island of a Thousand Mirrors");

        // List available items in the library again
        library.ListAvailableItems();

    }
}
