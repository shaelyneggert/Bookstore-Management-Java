import java.util.ArrayList;
import java.util.*;
public class Book extends Product
{
    // fields
    private ArrayList<Book> bookList = new ArrayList<Book>();

    // constructor 
    public Book(String title, String author, double price, int _stockInventory, int productID) 
    {
        super(title, author, price, _stockInventory, productID);
        
    }

    // toString
    @Override 
    public String toString() {
        return "Book: " + " [Name]: " + getProductName() + ", [Author]: " + getProductAuthor() + ", [Price]: $" + getProductPrice() + ", [Amount in Inventory]: " + getStockInventory();
    }

} // end Book Class