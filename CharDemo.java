/**
 * 
 * Although char is designed to hold Unicode characters, it can also be thought of as an
integer type on which you can perform arithmetic operations. For example, you can add
two characters together, or increment the value of a character variable. Consider the
following program:
 */
public class CharDemo {
    public static void main(String[] args){
        char ch1;
        ch1 = 'X';
        System.out.println("ch1 contains " + ch1);
        ch++; //increment ch1
        System.out.println("ch1 is now " + ch1);
    }
}