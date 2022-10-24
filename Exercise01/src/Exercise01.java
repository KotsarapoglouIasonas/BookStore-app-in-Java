
public class Exercise01 {

    public static void main(String[] args) {

        int unique = 0;
        BookStore store = new BookStore("Hello my Site", "210210210", "helloSite@gmail.com");
        Book b1 = new Book("Drama book", "Drama", 5, true, unique++);
        Book b2 = new Book("hey", "Drama", 25, false, unique++);
        Book b3 = new Book("hey1", "Drama", 7, true, unique++);
        Book b4 = new Book("hey2", "comic", 8, false, unique++);
        Book b5 = new Book("hey3", "fun", 8, false, unique++);
        Book b6 = new Book("hey4", "comic", 9, true, unique++);
        Book b7 = new Book("hey5", "fun", 15, false, unique++);
        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);
        store.addBook(b4);
        store.addBook(b5);
        store.addBook(b6);
        store.addBook(b7);
        store.dispplay();
        System.out.println("--------------------------------------------------");
        store.makeAvailableBook(b2);
        store.makeUnavailableBook(b1);
        store.displayBooksForCategory("Drama");
        System.out.println("--------------------------------------------------");
        store.dislayCategoryCost("Drama", 7);
        System.out.println("--------------------------------------------------");
        store.displayLowCostCategory();
        System.out.println("--------------------------------------------------");
        store.displayAvailableBooks();
    }

}
