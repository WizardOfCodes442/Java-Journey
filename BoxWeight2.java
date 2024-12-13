// Boxweight now fully implements all construct using super
public class BoxWeight2  extends Box2 {
    double weight; //weight of box

    //construct clone of an object 
    BoxWeight2(BoxWeight2 ob) { //pass object to a construcutor
        super(ob);
        weight = ob.weight;
    }

    // constructor when all parameters are specified 
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d); //call superclass constructor 
        weight = m;
    }

    // constructor used when cube is created 
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }

    //default constructor
    BoxWeight2() {
        super();
        weight = -1;
    }


}