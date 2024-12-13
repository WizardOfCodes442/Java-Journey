import org.graalvm.compiler.nodes.NodeView.Default;

public class ExceptionHandling {
    public static void main(String[] args) {
        int n = Default;
        try {
            n = Integer.parseInt(args[0]);
            if (n  <= 0){
                System.out.println("n must be positive . Using default");
                n = Default;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No argument  specified for n. Using default.");
        } catch(NumberFormatException e) {
            System.out.println("Invalid integer argument using defualt");
        }
    }
}