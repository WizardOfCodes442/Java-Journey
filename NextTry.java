/**
 * The try statement can be nested . That is, a try statement can be inside the block
 * of another try. Each time a try statement is entered , the context of that 
 * exception is pushed on to the stack. If an inner try statement does not have 
 * a catch handler for a particular exception, the stack is unwound and the 
 * next try statement's catch handler are inspected for a match, this continues 
 * until one of the statements succeds , or until all of the nested try statements
 * are exhausted. If no catch statement matches , then the java runtime system
 * will handle the exception..
 */
// An example of nested try statements
public class NextTry {
    public static void main(String args[]) {
        try {
            int a = args.length;

            /**
             * If no command-line args are present , 
             * the following statement will generate a divide-by-zero
             *  exception
             */

            int b = 42 / a;

            System.out.println("a = " + a);

            // nested try block
            try {
                /**
                 * If one command-line arg is used then a divide-by-zero
                 *  exception will be generated by the following code
                 */

                 if (a == 1) a = a/ (a-a); // division by zero

                 /**
                  * if two command-line args are used , then generate an 
                   an out-of-bounds exception
                  */

                  if (a ==2) {
                      int c[] = {1};
                      c[42] = 99; // generate  an out-of-bounds exception
                  }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
    
}