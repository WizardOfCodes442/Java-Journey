/**
*
*@author Micheal T. Goodrich
*@author Roberto Tamassia
*@author Micheal H. Goldwasser
 */

 public class CreditCard {
     /**
    *Construct a new credit card instance
    * @param cust    the name of the customer (e.g "John Bowman")
    * @param bk      the name of the bank (e.g  "California Savings")
    * @param acnt    the account identifier (e.g "5391 0375 9387 5309")
    * @param lim     the credit limit (measured in dollars)
    * @param initialBal the initial balance (measured in dollars)
    * */
    //instance variables
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    //constructors
    public CreditCard (String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0); //use a balance of zero as default
    }
    
    //Accessor methods
    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }

    // Update methods
    public boolean charge(double price) {
        if (price + balance > limit) // make a charge if charge would surpass limit
            return false;                // refuse the charge
        // at this point the charge is succesful
        balance += price;  //update the balance
        return true;       //announce the good news
    }

    public void makePayment(double amount) { //make a payment
        balance -= amount;
    }

    //Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);   //implicit cast
        System.out.println("Limit = " + card.limit); // implicit cast
    }

    //main method = program entry point
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman ", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);

        }
        for (CreditCard card : wallet){
            CreditCard.printSummary(card);   // calling static method
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New Balance = " + card.getBalance());
            }
        }
    }
 }