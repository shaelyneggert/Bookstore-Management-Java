import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.Collections;
public class Main {

    public static void main(String[] args) 
    {
        
        Bookstore order1 = new Bookstore();
       // Bookstore order1 = new Bookstore();
        ArrayList<Integer> shoppingCart = new ArrayList<Integer>();
        ArrayList<Product> productList = order1.getProductListInventory();
        ArrayList<Member> memberList = order1.getMemberInventory();
        ArrayList<PremiumMember> premiumMemberList = order1.getPremiumMemberInventory();
        ArrayList<Product> comparingProducts = new ArrayList<Product>();
        
        // start program
        System.out.println("***************************");
        System.out.println("Welcome to The Bookstore!");
        System.out.println("***************************");
        // start while loop
        while(order1.getStockInventory() != 0) {
        System.out.println("Please select from the following options by typing a number.");
        System.out.println("\t 1. Order Books, CDs, or DVDs.");
        System.out.println("\t 2. Premium Members & Discounts.");
        System.out.println("\t 3. Request to Restock Items.");
        System.out.println("\t 4. Compare Inventory Stock!");
        System.out.println("\t 5. Check Inventory & Hypothetically if We Sold Out...");
        System.out.println("\t 6. Exit.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // start switch
        switch (num) {
            case 1:
            System.out.println("Here is what we have in stock...");
            for(int i = 0; i < productList.size(); i++) {
                System.out.println(order1.getProductListInventory().get(i)); }
            System.out.println("Which book would you like? Please enter a number 1 through 9.");
            int choice1 = sc.nextInt();
            if(choice1 == 1) {
                Product bookChoice = order1.getProductListInventory().get(0);
                order1.removeProduct(bookChoice);
                System.out.println("Your total is: $" + bookChoice.getProductPrice() + ".");
            } else if (choice1 == 2) {
                Product bookChoice2 = order1.getProductListInventory().get(1);
                order1.removeProduct(bookChoice2);
                System.out.println("Your total is: $" + bookChoice2.getProductPrice() + ".");
            } else if (choice1 == 3) {
                Product bookChoice3 = order1.getProductListInventory().get(2);
                order1.removeProduct(bookChoice3);
                System.out.println("Your total is: $" + bookChoice3.getProductPrice() + ".");
            } else if (choice1 == 4) {
                Product CDchoice = order1.getProductListInventory().get(3);
                order1.removeProduct(CDchoice);
                System.out.println("Your total is: $" + CDchoice.getProductPrice() + ".");
            } else if (choice1 == 5) {
                Product CDchoice2 = order1.getProductListInventory().get(4);
                order1.removeProduct(CDchoice2);
                System.out.println("Your total is: $" + CDchoice2.getProductPrice() + ".");
            } else if (choice1 == 6) {
                Product CDchoice3 = order1.getProductListInventory().get(5);
                order1.removeProduct(CDchoice3);
                System.out.println("Your total is: $" + CDchoice3.getProductPrice() + ".");
            } else if (choice1 == 7) {
                Product DVDchoice = order1.getProductListInventory().get(6);
                order1.removeProduct(DVDchoice);
                System.out.println("Your total is: $" + DVDchoice.getProductPrice() + ".");
            } else if (choice1 == 8) {
                Product DVDchoice1 = order1.getProductListInventory().get(7);
                order1.removeProduct(DVDchoice1);
                System.out.println("Your total is: $" + DVDchoice1.getProductPrice() + ".");
            } else if (choice1 == 9) {
                Product DVDchoice2 = order1.getProductListInventory().get(8);
                order1.removeProduct(DVDchoice2);
                System.out.println("Your total is: $" + DVDchoice2.getProductPrice() + "."); }
            break;
            // creating new member 
            case 2: 
            int m = 0;
            int p = 0;
            System.out.println("Please select a membership to join:");
            System.out.println("\t 1. Regular Membership.");
            System.out.println("\t 2. Premium Membership.");
            int memberchoice = sc.nextInt();
            String memberchoice1 = sc.nextLine();


            // for(int i = 0; i < productList.size(); i++) {
            //     System.out.println(order1.getProductListInventory().get(i));
            if(memberchoice == 1) {
                System.out.println("Please enter your name. And then please enter your unique card number.");
                String newMemberName = sc.nextLine();
                int newUniqueID = sc.nextInt();
                System.out.println("Welcome, " + newMemberName + "! " + "You should see yourself now on our list of members.");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");        
                order1.addMember(newMemberName, newUniqueID, 0.0);          
                for(int n = 0; n < memberList.size(); n++) {
                    System.out.println(order1.getMemberInventory().get(n));  
                } 
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");        

            } else if (memberchoice == 2) {
                System.out.println("Please enter your name. After you hit enter, please enter your unique card number.");
                String newPremiumMemberName = sc.nextLine();
                int newPremiumUniqueID = sc.nextInt();
                System.out.println("Welcome, " + newPremiumMemberName + "! " + "You should see yourself now on our list of premium members.");
                order1.addPremiumMember(newPremiumMemberName, newPremiumUniqueID, 0.0, false);
                
                for(int w = 0; w < premiumMemberList.size(); w++) {
                    System.out.println(order1.getPremiumMemberInventory().get(w));
                }
            } 

            //prompt the user for their name and member ID(if regular member, they just need the name, premium needs card info too)
            //it needs to keep track of amount paid as well, so you can just set that to 0 when creating it
            break;

            // checking on how many items are left in inventory.
            case 3:
            for(int b = 0; b < productList.size(); b++) {
                System.out.println(order1.getProductListInventory().get(b)); }
            System.out.println("Which item would you like to restock? Please select a # 1-9");
            int restock = sc.nextInt();
            if(restock == 1) {
                Product p1= new Book("The Great Gatsby", "F. Scott Fitzgerald", 6.99, 2, 1);
                System.out.println("How many of the book 'Great Gatsby' would you like to restock?");
                int restockBook1 = sc.nextInt();
                p1.addToInventory(restockBook1);
                System.out.println("Great! You've added " + restockBook1 + " book(s)!");
                System.out.println("There is now: " + p1.getStockInventory() + " in inventory. ");
                comparingProducts.add(p1);
            } else if (restock == 2) {
                Product p2 = new Book("Pride and Prejudice", "Jane Austen", 11.69, 4, 2);
                System.out.println("How many of the book 'Pride and Prejudice' would you like to restock?");
                int restockBook2 = sc.nextInt();
                p2.addToInventory(restockBook2);
                System.out.println("Great! You've added " + restockBook2 + " book(s)!");
                System.out.println("There is now: " + p2.getStockInventory() + " in inventory. ");
                comparingProducts.add(p2);
            } else if (restock == 3) {
                Product p3 = new Book("The Perks of Being a Wallflower", "Stephen Chbosky", 12.16, 8, 3);
                System.out.println("How many of the book 'The Perks of Being a Wallflower' would you like to restock?");
                int restockBook3 = sc.nextInt();
                p3.addToInventory(restockBook3);
                System.out.println("Great! You've added " + restockBook3 + " book(s)!");
                System.out.println("There is now: " + p3.getStockInventory() + " in inventory.");
            } else if (restock == 4) {
                Product p4 = new CDs("Channel Orange", "Frank Ocean", 7.99, 1, 4);
                System.out.println("How many of the CD 'Channel Orange' would you like to restock?");
                int restockCD1 = sc.nextInt();
                p4.addToInventory(restockCD1);
                System.out.println("Woohoo! You've added " + restockCD1 + " CD(s)!");
                System.out.println("There is now: " + p4.getStockInventory() + " in inventory.");
            } else if (restock == 5) {
                Product p5 = new CDs("Unplugged in New York", "Nirvana", 6.99, 4, 5);
                System.out.println("How many of the CD 'Unplugged in New York' would you like to restock?");
                int restockCD2 = sc.nextInt();
                p5.addToInventory(restockCD2);
                System.out.println("Woohoo! You've added " + restockCD2 + " CD(s)!");
                System.out.println("There is now: " + p5.getStockInventory() + " in inventory.");
            } else if (restock == 6) {
                Product p6 = new CDs("Be the Cowboy", "Mitski", 13.29, 3, 6);
                System.out.println("How many of the CD 'Be the Cowboy' would you like to restock?");
                int restockCD3 = sc.nextInt();
                p6.addToInventory(restockCD3);
                System.out.println("Woohoo! You've added " + restockCD3 + " CD(s)!");
                System.out.println("There is now: " + p6.getStockInventory() + " in inventory.");
            } else if (restock == 7) {
                Product p7 = new DVDs("Saving Private Ryan", "Action", 9.99, 1, 7);
                System.out.println("How many of the DVD 'Saving Private Ryan' would you like to restock?");
                int restockDVD1 = sc.nextInt();
                p7.addToInventory(restockDVD1);
                System.out.println("Yipee! You've added " + restockDVD1 + " DVD(s)!");
                System.out.println("There is now: " + p7.getStockInventory() + " in inventory.");
            } else if (restock == 8) {
                Product p8 = new DVDs("Shawshenk Redemption", "Drama", 5.99, 9, 8);
                System.out.println("How many of the DVD 'Shawshenk Redemption' would you like to restock?");
                int restockDVD2 = sc.nextInt();
                p8.addToInventory(restockDVD2);
                System.out.println("Yipee! You've added " + restockDVD2 + " DVD(s)");
                System.out.println("There is now: " + p8.getStockInventory() + " in inventory.");
            } else if (restock == 9) {
                Product p9 = new DVDs("Forrest Gump", "Comedy Drama", 6.39, 5, 9);
                System.out.println("How many of the DVD 'Forrest Gump' would you like to restock?");
                int restockDVD3 = sc.nextInt();
                p9.addToInventory(restockDVD3);
                System.out.println("Yipee! You've added " + restockDVD3 + " DVD(s)");
                System.out.println("There is now: " + p9.getStockInventory() + " in inventory.");
            }
            break;

            case 4:
            System.out.println("Let's compare the stock inventory for each of our products!");
            System.out.println("************************************");
            ArrayList<Product> products = order1.getProductListInventory();
         
            Collections.sort(products);
            for (Product g : products) {
                System.out.println(g);
            }
            System.out.println("************************************");
            
            break;

            case 5:
            System.out.println("************************************");
            System.out.println("\t The total amount of items in our inventory = " + order1.getTotalInventory() + ".");
            System.out.println("\t If we were to sell out of everything our profit would be: $" + order1.inventoryValue());
            System.out.println("************************************");
    
            break;
            // exit
            case 6:
            System.exit(0);
            break;
            default:
            System.out.println("Sorry, you need to enter 1, 2, 3, or 4");
      
            
            } // end switch
          } // end while loop
        } // end main method
    } // end main Class


