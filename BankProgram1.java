import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BankProgram1 {
    private HashMap<Integer, Integer> accounts = new HashMap<>();
    private double rate = 0.01;
    private int nextacct = 0;
    private int current = -1;
    private Scanner scanner;
    private boolean done = false;

    public static void main(String[] args){
        BankProgram1 program = new BankProgram1();
        program.run();
    }

    public void run(){
        scanner = new Scanner(System.in);
        while (!done){
            System.out.print("Enter command (0=quit, 1=new, 2=select, 3=deposit, 4=loan, 5=show, 6=interest): ");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
        scanner.close();
    }

    private void processCommand(int cmd){
        if       (cmd == 0) quit();
        else if  (cmd == 1) newAccount();
        else if  (cmd == 2) select();
        else if  (cmd == 3) deposit();
        else if  (cmd == 4) authorizeLoan();
        else if  (cmd == 5) showAll();
        else if  (cmd == 6) addInterest();
        else 
            System.out.println("illegal command");
    }
    /**
    
    The Program's run method performs a loop that repeatedly reads commands from the console and executes them 
    There are seven commands, each of which has a corresponding method , The quit method sets the global 
    variable done to true , which causes the loop to terminate
     */

    private void quit(){
         done = true;
         System.out.println("Goodbye!");
    }

     /**
     The global variable current keeps track of the current account. The newAccount method allocates 
     a new account number , makes it current and assignit to the map with an initial balance of zero 
      */

    private void newAccount(){
          current = nextacct++;
          accounts.put(current, 0);
          System.out.println("Your new account number is " + current);
    }

    /**
      The select method makes an existing account current, it also prints the account balance
    */
    private void select() {
           System.out.print("Enter account#: ");
           current = scanner.nextInt();
           int balance = accounts.get(current);
           System.out.println("The balance of account " + current + " is " + balance);
       }

    /**
       The deposit method increases the balance of the current by the current account by a 
       specified numbver of cents.
    */

    private void deposit() {
            System.out.print("Enter deposit amount: ");
            int amt = scanner.nextInt();
            int balance = accounts.get(current);
            accounts.put(current, balance+amt);
    }

    /**
        The method authorizeLoan determines whether the current account has enough money to be used 
        as collateral for a loan .the criterion is that the account must contain half of the loan 
        amount 
    */

    private void authorizeLoan() {
            System.out.print("Enter loan amount: ");
            int loanamt = scanner.nextInt();
            int balance = accounts.get(current);
            if (balance >= loanamt/2)
                System.out.println("Your loan is approved");
            else
                System.out.println("Your loan is denied");

    }

    /**
         The show all method show the balance of every account.
    */

    private void showAll() {
            Set<Integer> accts = accounts.keySet();
            System.out.println("The bank has" + accts.size() + " accounts.");
          
            for (int i : accts)
                System.out.println("\tBank account " + ": balance=" + accounts.get(i));
    }

    /**
          Finally the addInterest method increases the balance of each accounts by a fixed interest rate
    */

    public void addInterest() {
        Set<Integer> accts = accounts.keySet();
        for (int i : accts) {
            int balance  = accounts.get(i);
            int newbalance = (int) (balance * (1 + rate));
            accounts.put(i, newbalance);
        }

    }

}