import java.util.ArrayList;
import java.util.*;
public class Bookstore implements BookstoreSpecification {
    // fields
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private ArrayList<CDs> CDsList = new ArrayList<CDs>();
    private ArrayList<DVDs> DVDsList = new ArrayList<DVDs>();
    private ArrayList<Member> memberList = new ArrayList<>();
    private ArrayList<PremiumMember> premiumMemberList = new ArrayList<>();
    private double amountSpent = 0.0;
    private static int nextOrderNum = 0;
    private boolean hasPaidDues = true;
    private int productID;
    private int inventory;


    // remove product 
    public void removeProduct(Product productp) 
    {
        productList.remove(productp);
    }
    // getter for product list inventory
    public ArrayList<Product> getProductListInventory() {
        return productList; 
    }
    // getter for regular member
    public ArrayList<Member> getMemberInventory() {
        return memberList;
    }
    // getter for premium member
    public ArrayList<PremiumMember> getPremiumMemberInventory() {
        return premiumMemberList;
    }
   
    // adding one to nextOrderNum
    public int incrementNextOrderNum() {
         return nextOrderNum++;
    }

    // get inventory that's left
    public double getStockInventory() {
        return productList.size();
    }

    // get inventory value
     public double inventoryValue() {
        double total = 0.0;
        for(Product totalPrice : productList) {
            total += totalPrice.getStockInventory() * totalPrice.getProductPrice();
        }
        return total;
    }

   // get total inventory
    public int getTotalInventory() {
        int totalInventory2 = 0;
        for(Product totalinventory : productList) {
            totalInventory2 += totalinventory.getStockInventory();
        }
        return totalInventory2;
    }

    // adding a regular member
    public String addMember(String memberName, long cardNumber, double amountSpent) {
        Member member1 = new Member(memberName, cardNumber, amountSpent);
        memberList.add(member1);
        return memberName;
    }

    // adding a premium member
    public String addPremiumMember(String premiumMemberName, int premiumCardNumber, double amountSpent, boolean hasPaidDues) {  
        PremiumMember premiummember1 = new PremiumMember(premiumMemberName, premiumCardNumber, amountSpent, hasPaidDues);
        premiumMemberList.add(premiummember1);
        return premiumMemberName;
    }


    // implementing bookstore specification 
    public void restockProduct(int inventory, int productID) {
        for(Product p: productList) {
            if (productID == p.getProductID()) {
                p.addToInventory(inventory);
            } 
        }
    }

    // Bookstore constructor 
    public Bookstore()
    {
        // add books
        productList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 6.99, 2, 1));
        productList.add(new Book("Pride and Prejudice", "Jane Austen", 11.69, 4, 2));
        productList.add(new Book("The Perks of Being a Wallflower", "Stephen Chbosky", 12.16, 8, 3));
        // add cds
        productList.add(new CDs("Channel Orange", "Frank Ocean", 7.99, 1, 4));
        productList.add(new CDs("Unplugged in New York", "Nirvana", 6.99, 4, 5));
        productList.add(new CDs("Be the Cowboy", "Mitski", 13.29, 3, 6));
        // add dvds
        productList.add(new DVDs("Saving Private Ryan", "Action", 9.99, 1, 7));
        productList.add(new DVDs("Shawshenk Redemption", "Drama", 5.99, 9, 8));
        productList.add(new DVDs("Forrest Gump", "Comedy Drama", 6.39, 5, 9));
        // add member
        memberList.add(new Member("Shae", 123456, 80.88));
        memberList.add(new Member("Amanda",678910, 7.50));
        memberList.add(new Member("John", 987654, 50.75));
        // add premium member
        premiumMemberList.add(new PremiumMember("Emily ", 52598, 67.80, true));
        premiumMemberList.add(new PremiumMember("Andrew ", 66655438, 145.89, false)); 
    }

    // toString()
    public String toString() {
        return "Books {" + bookList + " }" + "CDs {" + CDsList + " }" + "DVDs {" + DVDsList + "}";
    }


} // end Bookstore class