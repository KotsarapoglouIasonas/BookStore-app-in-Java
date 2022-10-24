
import java.util.ArrayList;

public class BookStore {

    private String site;
    private String phone;
    private String email;
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookStore(String site, String phone, String email) {
        this.site = site;
        this.phone = phone;
        this.email = email;
    }

    public void dispplay() {
        System.out.println("Site address : " + site + "\nPhone number : " + phone + "\nEmail address : " + email);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void makeAvailableBook(Book book) {
        book.makeAvailable();
    }

    public void makeUnavailableBook(Book book) {
        book.makeUnvailable();
    }

    public void displayBooksForCategory(String category) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getCategory().equals(category)) {
                books.get(i).display();
            }
        }
    }

    public void dislayCategoryCost(String category, int cost) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getCategory().equals(category) && books.get(i).getCost() <= cost) {
                books.get(i).display();
            }
        }
    }

    public void displayAvailableBooks() {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isAvailable() == true) {
                books.get(i).display();
            }
        }
    }

    public void displayLowCostCategory() {
        ArrayList<String> categories = new ArrayList<String>();
        ArrayList<Book> lowPriceBooks = new ArrayList<Book>();
        for (int i = 0; i < books.size(); i++) {
            if (categories.contains(books.get(i).getCategory()) == false) {
                categories.add(books.get(i).getCategory());
                lowPriceBooks.add(books.get(i));
            }
        }
        for (int i = 0; i < categories.size(); i++) {
            for (int j = 0; j < books.size(); j++) {
                if (categories.get(i).equals(books.get(j).getCategory())) {
                    if (books.get(j).getCost() < lowPriceBooks.get(i).getCost()) {
                        lowPriceBooks.set(i, books.get(j));
                    }
                }
            }
        }
        for (int k = 0; k < lowPriceBooks.size(); k++) {
            lowPriceBooks.get(k).display();
        }
    }

}
