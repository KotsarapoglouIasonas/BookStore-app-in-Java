
public class Book {

    private String code;
    private String description;
    private String category;
    private int cost;
    private boolean available;

    public Book() {
        code = "";
        description = "";
        category = "";
        cost = 0;
        available = false;
    }

    public Book(String description, String category, int cost, boolean available, int unique) {
        this.description = description;
        this.category = category;
        this.cost = cost;
        this.available = available;
        code = this.category + unique;
    }

    public String getCategory() {
        return category;
    }

    public int getCost() {
        return cost;
    }

    public void makeAvailable() {
        available = true;
    }

    public void makeUnvailable() {
        available = false;
    }

    public boolean isAvailable() {
        return available;
    }

    public void display() {
        System.out.println("Unique code : " + code + "\nCategory : " + category + "\nDescription : " + description + "\nAvailable : " + available + "\nCost : " + cost);
    }

}
