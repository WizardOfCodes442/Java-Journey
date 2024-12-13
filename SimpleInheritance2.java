public class SimpleInheritance2  {
    public static void main(String args []) {
        Xclass superOb = new Xclass();
        Z subOb = new Z();
        
        // The superclass maybe used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        /**
         * The subclass has access to all public members its superclass
         */
        subOb.i = 7;
        subOb.j = 8;
        subOb.j = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("sum of i , j , and k in subOb: ");
        subOb.sum();

    }
    
}