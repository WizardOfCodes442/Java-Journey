public class ThrowDemo2 {
    static void throwOne() {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");

    }
    public static void main (String args[]) {
        throwOne();
    } 
}
