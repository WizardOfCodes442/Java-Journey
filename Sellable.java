/***
 * interface for object that can be sold
 */

 public interface Sellable {

    /** 
     * Return a string description of the object
     */

     public String Description();

     /**Returns the list price in cent */
     public int listPrice();

     /**Returns the lowest price in cent we will accept */
     public int lowestPrice();
     
 }