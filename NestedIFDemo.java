public class NestedIFDemo {
    public static void main(String args[]) {
        // use a nested interface reference
        NestedInterface.NestedInterface.NI nif = new ImplementNI();

        if (nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if (nif.isNotNegative(-12))
            System.out.println("This won't be displayed");
    }
}
