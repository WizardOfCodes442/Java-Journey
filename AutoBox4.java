// Autoboxing / unboxing  a Boolean Character
public class AutoBox4 {
    public static void main(String args[]) {
        // Autobox / unbox  a boolean value
        Boolean b = true;

        // Below, b is auto- unboxed when used 
        // in a conditional expression , such as an if 
        if(b) System.out.println("b is true");

        //Autobox / unbox  a char
        Character ch = 'x'; // box a char
        char ch2 = ch; // unbox a char

        System.out.println("ch2 is " + ch2);
    }
}
