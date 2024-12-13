/**
 * When you use multiple catch statements, it is important to remember that 
 * exception subclasses must come before any of their superclasses. this is 
 * because a catch statement that uses a superclass will catch exceptions 
 * of that type plus any of its subclasses . Thus , a subclass would never
 * be reached if it came after it superclass... further in java, unreachable 
 * code is an error. For example , consider the following program
 */

/**
 * This program contains an error
 * 
 *  A subclass must come before its superclass in a series
 *  of catch statements. If not , unreachable code will be 
 *  created and a compile time error will result
 */
public class SuperSubCatch {
    public static void main(String args) {
        try {
            int a = 0;
            int b = 42 / a;

        }
        catch (Exception e) {
            System.out.println("Generic Exception catch");
        }
        /**
         *  This catch is never reached because 
         * ArithmeticException is a subclass of Exception.. 
         */

         catch(ArithmeticException e) {
             // ERROR  -- Unreachable
             System.out.println("This is never reached");
         }
    }
    
}
