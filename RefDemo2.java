/**
 * A reference variable of a superclass can be assigned a reference to 
 * any subclass derived from that superclass , you will find this aspect 
 * of inheritance useful in a lot of situations
 */
public class RefDemo2 {
    public static void main(String args[]){
        BoxWeight01 weightbox = new BoxWeight01(3, 5, 7, 8.34);
        Box01 plainbox = new Box01();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();

        // assign BoxWeight reference to Box reference
        plainbox = weightbox;
        vol = plainbox.volume(); //OK , Volume defined in Box
        System.out.println("Volume of plainbox is " + vol);

        /**
         * The following statement  is invalid becuase plainbox does not 
         * define a weight member
         */
        // System.out.println("Weight of plainbox is " + plainbox.weight); 
    }
}