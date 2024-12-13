// add a shipping cost
public class Shipment extends BoxWeight02 {
    double cost;

    //construct clone of an object
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    
    // constructor when all parameter are specified
    Shipment (double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost =c;
    }
    
    // default constructor
    Shipment() {
        super();
        cost = -1;
    }

    // constructor used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }

    
}