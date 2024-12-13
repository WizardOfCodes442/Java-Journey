public class HandleError {
    public static void main(String args[]) {
        try {
            int a = 0;
            int b = 5;
            int c = b/a;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception  " + e);
        }
    }
}