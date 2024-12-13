// fully implement all the Constructors in Box01
public class BoxWeight02 {
    double weight; // weight of box 
    
    // construct clone of an object 
    BoxWeight02 (BoxWeight02 ob) {
        super(ob);
        weight = ob.weight;

    }

    // constructor when all parameters are specified 
    BoxWeight02 (double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    //default constructor
    BoxWeight02 () {
        super();
        weight = -1;
    }
    
    // Constructor used when a cube is created
    BoxWeight02 (double len, double m) {
        super(len);
        weight = m;
    }

}