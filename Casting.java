public class Casting {
    public static void main(String[] args) {
        Number n;
        Integer i;
        n = new Integer(3);
        if (n instanceof Integer) {
            i = (Integer) n;  // this is legal
        }
        n = new Double(3.145);
        if (n instanceof Integer) {
            i = (Integer) n;  // This will not be attempted
        }

        
    }
}