class BOOK{
    int bookId;
    double price;
    int quantity;
    static double totalAmount = 0;
    BOOK(int bookId, double price, int quantity){
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
        totalAmount += calculateTotalCost();
    }
    void displayDetails(){
        System.out.println("Book ID: "+bookId);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
    double calculateTotalCost(){
        return price * quantity;
    }

}
public class Q3 {
    public static void main(String[] args){
        BOOK B1 = new BOOK(101, 500, 2);
        BOOK B2 = new BOOK(102, 300, 3);
        BOOK B3 = new BOOK(103, 450, 1);
        BOOK B4 = new BOOK(104, 600, 4);
        BOOK B5 = new BOOK(105, 250, 5);
        B1.displayDetails();
        B2.displayDetails();
        B3.displayDetails();
        B4.displayDetails();
        B5.displayDetails();
        System.out.println("Total amount spent on purchase of all the books: "+BOOK.totalAmount);
    }
}
