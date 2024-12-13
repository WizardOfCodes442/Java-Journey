public class IFTest3 {
    public static void main(String args[]) {
        IntStack mystack; // creates an interface reference variable
        DynamicStack ds = new DynamicStack(5);
        FixedStack fs = new FixedStack(8);
        
        mystack = ds;  // load dynamic stack
        // push some numbers onto the stack
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs; // load fixed stack
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Values in dynamic stack");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());
        
        mystack = fs;
        System.out.println("Values in fixed stack.");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());

    }
}
