public class FinallyDemo2 {
    // Throw an exception out of a method 
    static void procA {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");

        }  finally {
            System.out.println("procA finally");
        }
    }

    // return from within a try block
    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's finally");

        }
    }

    // execute a try block normally
    static void procC() {
        try {
            System.out.println("inside procC");
        }
        finally {
            System.out.println("procC's finally")
        }
    }

    public static void main(String args[]) {
        try {
            procA();
            catch (Exception e) {
                System.out.println("Exception caught");
            }

            procB();
            procC();
        }
    }
}
