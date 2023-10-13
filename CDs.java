import java.util.ArrayList;
import java.util.*;
public class CDs extends Product {
    // fields
    private ArrayList<CDs> CDsList = new ArrayList<CDs>();

    // contructor 
    public CDs(String albumName, String artistName, double CDprice, int stockInventory, int productID)
    {
        super(albumName, artistName, CDprice, stockInventory, productID);
    }


    @Override 
    public String toString() {
        return "CD: " + " [Name]: " + getProductName() + " [Author]: " + getProductAuthor() + " [Price]: $" + getProductPrice() + ", [Amount in Inventory]: " + getStockInventory();
    }
} // end CD class