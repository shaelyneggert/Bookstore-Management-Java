import java.util.ArrayList;
import java.util.*;
public class Member {
    
    private String memberName = " ";
    private double amountSpent = 0.0;  //need amount spent field
    private long cardNumber;
    private ArrayList<Member> memberList = new ArrayList<>();

    // member constructor 
    public Member(String memberName, long cardNumber, double amountSpent) {
        this.memberName = memberName;
        this.cardNumber = cardNumber;
        this.amountSpent = amountSpent; 
    }

    // getter for membername 
    public String getMemberName() {
        return memberName;
    }
    // setter for membername 
    public void setMemberName(String newMemberName) {
        this.memberName = newMemberName;
    }

    // getter for card number
    public long getCardNumber() {
        return cardNumber;
    }
    // setter for card number
    public void setCardNumber(long newCardNumber) {
        this.cardNumber = newCardNumber;
    }

    // getter for amount spent 
    public double getAmountSpent() {
        return amountSpent;
    }
    // setter for amount spent 
    public void setMemberPurchases(double purchases) {
        this.amountSpent = purchases;
    }

    

    // toString()
    public String toString() {
        return "\t " + "{Name}: " + memberName + ", {Unique Card #}: " + cardNumber + ", {Amount Spent}: $" + amountSpent;
    }

}