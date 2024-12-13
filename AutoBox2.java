// Autoboxing / unboxing takes places with
// method parameters and return values
public class AutoBox2 {
    // Take an integer parameter and return 
    // an int value
    static int m (Integer v) {
        return v; // auto -- unbox to int

    }

    public static void main(String args[]) {
        //pass an int to m() and assign  the retrun value
        // to an Integer, Here the argument 100 is autoboxed
        //into an integer. The return value is auto-unboxed
        // into an int
        Integer iOB = m(100);
        System.out.println(iOB);
        
    }
}
