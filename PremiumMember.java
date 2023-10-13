import java.util.ArrayList;
import java.util.*;
public class PremiumMember {

    private String premiumMemberName;
    private double amountSpent = 0.0; // amount spent field
    private boolean hasPaidDues; 
    private int premiumCardNumber; 
    private ArrayList<PremiumMember> premiumMemberList = new ArrayList<>();
   
    // premium member contructor 
    public PremiumMember(String premiumMemberName, int premiumCardNumber, double amountSpent, boolean hasPaidDues) {
        this.premiumMemberName = premiumMemberName;
        this.amountSpent = amountSpent; 
        this.hasPaidDues = hasPaidDues;
        this.premiumCardNumber = premiumCardNumber;
    }
    
    // get member name
    public String getPremiumMemberName() {
        return premiumMemberName;
    }
    // get card info
    public int getPremiumCardNumber() {
        return premiumCardNumber;
    }
    // set card info 
    public void setPremiumCardNumber(int newPremiumCardNumber) {
        this.premiumCardNumber = newPremiumCardNumber;
    }
    // get amount spent
    public double getamountSpent() {
        return amountSpent;
    }
    // boolean, hasPaidDues
    public boolean hasPaidDues() {
        return hasPaidDues; 
    }

    // toString()
    public String toString() {
        return "\t " + premiumMemberName + " {Card Number}: " + premiumCardNumber + ", {Amount Spent}: $" + amountSpent + " {Paid Dues?}: " + hasPaidDues;
    }




    

    
}