enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;  // price of each apple

    //constructor 
    Apple (int p) { price = p;}

    int getPrice() { return price;}
}
public class EnumDemo2 {
    public static void main(String args[]) {
        Apple ap; // why was this declared but never went into use
        // when the variable ap is declared in main(), the constructor for the Apple
        // is called once for each constant that is specified.

        // Display all apples and prices.
        System.out.println("All apple prices: ");
        for (Apple a : Apple.values() )
            System.out.println(a + "costs " + a.getPrice() + " cents.");
    }
}
