import java.util.ArrayList;
import java.util.*;
public class DVDs extends Product{
    // fields 
    private ArrayList<DVDs> DVDsList = new ArrayList<DVDs>();
    // DVD constructor 
    public DVDs(String DVDTitle, String DVDGenre, double DVDPrice, int stockInventory, int productID)
    {
        super(DVDTitle, DVDGenre, DVDPrice, stockInventory, productID);
    }

    @Override 
    public String toString() {
        return "DVD: " + " [Name]: " + getProductName() + " [Author]: " + getProductAuthor() + " [Price]: $" + getProductPrice() + ", [Amount in Inventory]: " + getStockInventory();
    }
} // end DVDs class