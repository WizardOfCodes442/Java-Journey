public class SimpleInheritance {
    public static void main(String[] args){
        A superOB = new A();
        B subOB = new B();

        // The superclass may be used by itself 
        superOB.i = 10;
        superOB.j = 20;

        System.out.println("Contents of superOB: ");
        superOB.showij();
        System.out.println();

        /**
         * The subclass has access to  all public members
         * of its superclass
         */

        subOB.i  = 7;
        subOB.j = 8;
        subOB.k = 9;
        System.out.println("Contents of subOB: ");
        subOB.showij();
        subOB.showk();
        System.out.println();

        System.out.println("Sum of i , j and k in subOB : ");
        subOB.sum();

    }    
}