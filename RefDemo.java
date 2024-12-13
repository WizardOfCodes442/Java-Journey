/**abstract
 * A reference variable of a superclass can be assigned a reference to any subclass derived from
that superclass. You will find this aspect of inheritance quite useful in a variety of situations.
For example, consider the following:
 */
public class RefDemo {
    public static void main(String[] args){
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of box is " weightbox.weight);

        System.out.println();

        // assign  BoxWeight reference  to Box reference 
        plainbox = weightbox;
        vol = plainbox.volume(); // OK , volume is defined in box
        System.out.println("Volume of plainbox is " + vol);

        /**
         * The following statement is invalid because plainbox does not define a weight  
         * member 
         */
        // System.out.println("Weight of plainbox is " + plainbox.weight)
    }
}