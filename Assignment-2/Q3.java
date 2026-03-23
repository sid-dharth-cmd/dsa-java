class Book {
    int bookId;
    double price;
    int quantity;
    static double totalAmount = 0;

    Book(int bookId, double price, int quantity){
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;

        totalAmount += price * quantity;
    }

    void displayDetails(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    double calculateCost(){
        return price * quantity;
    }
}
public class Q3 {
    public static void main(String[] args){

        Book b1 = new Book(101, 200, 2);
        Book b2 = new Book(102, 150, 1);
        Book b3 = new Book(103, 300, 1);
        Book b4 = new Book(104, 250, 2);
        Book b5 = new Book(105, 100, 3);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();

        System.out.println("Total Amount: " + Book.totalAmount);
    }
}