/**
 * In a class heirarchy, private members 
 * remain private to their class
 * 
 * This program will not compile
 */
//create a superclass
public class C {
    int i; // public by default
    private int j; // private to C

    void setij(int x , int y) {
        i = x;
        j = y;
    }
    
}