/** Generates a simple progression By Default: 0, 1, 3 */
public class Progression {
    //instance variable
    protected long current;

    /** Construct progression starting at zero */
    public Progression() {this(0);}

    /** constructs a progression with a given start value */
    public Progression(long start) {current = start;}

    /** Returns the nextvalue of the progression */
    public long nextValue() {
        long answer = current;
        advance(); //this protected call is responsible for advancing the current value
        return answer;
    }

    /** Advances the current value to the next value of the progression */
    protected void advance() {
        current++;
    }
    /** Prints the next n values of the progression seperated by spaces */
    public void printProgression(int n){
        System.out.println(nextValue());  //print first value without leading space
        for(int j=1; j < n; j++){
            System.out.print(" " + nextValue); //print leading spaces before others
        }
        System.out.println();
    }
}