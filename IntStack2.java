/**
 * Beginning with jdk 9 , an interface can include a private method
 * A private interface method can be called only a default method or
 * another private method defined by thesame interface...
 * because a private method is specified private it cannot be 
 * used by code outside the interface in which it is defined
 * This restriction includes subinterfaces because a 
 * private method is not inherited by a subunterface.
 * 
 * Here is another version of IntStack interface that 
 * that has two default methods called 
 * popNElements() and skipAndPopNElements(). 
 * The first return an array that contain top
 * N elements on the Stack. 
 * The second skips a specified number of elements and then
 * returns an array that contains next N elements 
 * Both use a private method called getElements() to obtain an array
 * of the specified number of elements from the stack
 */

 // Another version of IntStack that has a private
 // interface method, that is used by two default methods

public interface IntStack2 {
    void push(int item); // store an item
    int pop(); //retrieve an item
    
    //A default method that returns an array that contains 
    // the top n elements on the stack

    default int[] popNElements(int n) {
        // Return the requested elements 
        return getElements(n);
    }

    // A default method that returns an array that 
    // contains the next n elements on the stack after
    // skipping the elements

    default int [] skipAndPopNElements(int skip, int n) {
        // skip the specified number of elements
        getElements(skip);

        // Return the requested elements
        return getElements(n);

    }

    // A private method that returns an array containing
    // the top n elements on the stack
    private int [] getElements(int n) {
        int [] elements = new int[n];

        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }
}
