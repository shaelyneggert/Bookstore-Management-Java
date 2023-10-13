public abstract class Product implements Comparable<Product>{

    private double price;
    private String name;
    private int inventory;
    private String author;
    private int productID;

    public Product(String name, String author, double price, int inventory, int productID) 
    {
        this.name = name;
        this.price = price;
        this.author = author;
        this.inventory = inventory;
        this.productID = productID; 
    }
    // get stock
    public int getStockInventory() {
        return inventory;
    }
    // adding to inventory 
    public void addToInventory(int a) {
        inventory += a; 
    }
    // product name
    public String getProductName() {
        return name; 
    }

    // product author 
    public String getProductAuthor() {
        return author;
    }
    // product price 
    public double getProductPrice() {
        return price;
    }
    // product id
    public int getProductID() {
        return productID;
    }

    public int compareTo(Product o) {
        Product s = (Product) o;
        //System.out.println( this.getStockInventory() + " and " + o.getStockInventory());
        if(o.getStockInventory() > this.getStockInventory()) {
            return -1;
        } else if (o.getStockInventory() < this.getStockInventory()) {
            return 1;
        } else if (o.getStockInventory() == this.getStockInventory()) {
            return 0;
        }
        return 0;
    }

    

    // toString 
    public String toString() {
        return "Item:  "  + getProductName() + ": " + getProductAuthor() + ", Author: " + getProductAuthor() + ", Price: " + getProductPrice() + "Items in Inventory: " + getStockInventory() + ".";
    }

    
    




    




} // end Product class 