// An error produced by manually unboxing
public class UnboxingError {
    public static void main(String args[] {
        Integer iOb = 1000; // aubox the value 1000
        int i = iOb.byteValue(); // Manually unboxes as bytes  !!!
        System.out.println(i); //does not display 1000
    })
}
